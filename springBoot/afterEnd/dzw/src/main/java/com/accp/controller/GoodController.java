package com.accp.controller;

import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Goods;
import com.accp.domain.goodsdata;
import com.accp.service.GoodService;

@RestController
public class GoodController {
	@Autowired
	GoodService goodService;
	
	@PostMapping("/goodsel")
	public List<goodsdata> goodsel(String typenames,String mcs,String fccx,String fcdm,String fcmc,String fcpp){
		return goodService.goodsel(typenames, mcs, fccx, fcdm, fcmc, fcpp);
	}
	
	@GetMapping("/daochugood")
	public ResponseEntity<byte []> cars() throws IOException{
		List<goodsdata> list=goodService.find();
		Workbook wb=new XSSFWorkbook();
		CellStyle cellStyle = wb.createCellStyle();
		Sheet sheet=wb.createSheet("商品资料");
		Row titleRow=sheet.createRow(0);
		titleRow.createCell(0).setCellValue("登记门面");
		titleRow.createCell(1).setCellValue("照片名");
		titleRow.createCell(2).setCellValue("商品编码");
		titleRow.createCell(3).setCellValue("商品名称");
		titleRow.createCell(4).setCellValue("商品品牌");
		titleRow.createCell(5).setCellValue("适用车型");
		titleRow.createCell(6).setCellValue("数量单位");
		titleRow.createCell(7).setCellValue("商品大类");
		titleRow.createCell(8).setCellValue("商品中类");
		titleRow.createCell(9).setCellValue("商品小类");
		titleRow.createCell(10).setCellValue("收入分类");
		titleRow.createCell(11).setCellValue("原厂副厂");
		titleRow.createCell(12).setCellValue("商品等级");
		titleRow.createCell(13).setCellValue("商品产地");
		titleRow.createCell(14).setCellValue("厂商名称");
		titleRow.createCell(15).setCellValue("原厂编码");
		titleRow.createCell(16).setCellValue("条形码");
		titleRow.createCell(17).setCellValue("包装规格");
		titleRow.createCell(18).setCellValue("体积A");
		titleRow.createCell(19).setCellValue("毛重");
		titleRow.createCell(20).setCellValue("净重");
		titleRow.createCell(21).setCellValue("加价率");
		titleRow.createCell(22).setCellValue("互换码");
		titleRow.createCell(23).setCellValue("售价按");
		for (int i = 0; i <list.size(); i++) {
			Row row = sheet.createRow(i+1);
			Cell cellstorename = row.createCell(0);
			Cell cellremark1 = row.createCell(1);
			Cell cellgid = row.createCell(2);
			Cell cellgname = row.createCell(3);
			Cell cellbrandname = row.createCell(4);
			Cell cellapplycar = row.createCell(5);
			Cell cellnumbename = row.createCell(6);
			Cell celltypename = row.createCell(7);
			Cell cellcentreclassify = row.createCell(8);
			Cell cellsmallclassify = row.createCell(9);
			Cell cellincomename = row.createCell(10);
			Cell cellOriginalname = row.createCell(11);
			Cell cellplacename = row.createCell(12);
			Cell cellsitename = row.createCell(13);
			Cell cellcoding = row.createCell(14);
			Cell cellbarcodes = row.createCell(15);
			Cell cellspecs = row.createCell(16);
			Cell cellvolume = row.createCell(17);
			Cell cellnetweight = row.createCell(18);
			Cell cellsuttle = row.createCell(19);
			Cell cellhike = row.createCell(20);
			Cell cellexchange = row.createCell(21);
			Cell cellpricename = row.createCell(22);
			Cell cellyieldiy = row.createCell(23);
			cellstorename.setCellValue(list.get(i).getStorename());
			cellremark1.setCellValue(list.get(i).getRemark1());
			cellyieldiy.setCellValue(list.get(i).getYieldiy());
			cellgid.setCellValue(list.get(i).getGid());
			cellgname.setCellValue(list.get(i).getGname());
			cellbrandname.setCellValue(list.get(i).getBrandname());
			cellapplycar.setCellValue(list.get(i).getApplycar());
			cellnumbename.setCellValue(list.get(i).getNumbename());
			celltypename.setCellValue(list.get(i).getTypename());
			cellcentreclassify.setCellValue(list.get(i).getCentreclassify());
			cellsmallclassify.setCellValue(list.get(i).getSmallclassify());
			cellincomename.setCellValue(list.get(i).getIncomename());
			cellOriginalname.setCellValue(list.get(i).getOriginalname());
			cellplacename.setCellValue(list.get(i).getPlacename());
			cellsitename.setCellValue(list.get(i).getSitename());
			cellcoding.setCellValue(list.get(i).getCoding());
			cellbarcodes.setCellValue(list.get(i).getBarcodes());
			cellspecs.setCellValue(list.get(i).getSpecs());
			cellvolume.setCellValue(list.get(i).getVolume());
			cellnetweight.setCellValue(list.get(i).getNetweight());
			cellsuttle.setCellValue(list.get(i).getSuttle());
			cellhike.setCellValue(list.get(i).getHike());
			cellexchange.setCellValue(list.get(i).getExchange());
			cellpricename.setCellValue(list.get(i).getPricename());
		}
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		wb.write(baos);
		HttpHeaders headers=new HttpHeaders();
		headers.setContentDispositionFormData("attachment", new String("商品资料数据.xlsx".getBytes("utf-8"),"iso-8859-1"));
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(baos.toByteArray(),headers,HttpStatus.OK);
	}
	
	@PostMapping("/gooddel")
	public int gooddelete(int gid) {
		return goodService.gooddelete(gid);
	}
	
	@PostMapping("/goodsins")
	public int goodsins(Goods goods) {
		return goodService.goodsins(goods);
	}
	
	@PostMapping("/goodupdsel")
	public Goods goodupdsel(int gid) {
		return goodService.goodupdsel(gid);
	}
	
	@PostMapping("/goodupd")
	public int goodupd(Goods goods) {
		return goodService.goodupd(goods);
	}
}
