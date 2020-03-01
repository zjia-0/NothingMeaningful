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

import com.accp.domain.Carbrand;
import com.accp.service.CarbrandService;

@RestController
public class CarbrandController {
	@Autowired
	CarbrandService carbrandService;
	
	@PostMapping("/carbrand")
	public List<Carbrand> car(){
		return carbrandService.car();
	}
	
	@PostMapping("/fdjpps")
	public List<Carbrand> fdjpp(){
		return carbrandService.car();
	}
	
	@PostMapping("/carbrandinsert")
	public int carbrandinsert(Carbrand carbrand){
		return carbrandService.cari(carbrand);
	}
	
	@PostMapping("/updates")
	public Carbrand carbrandupdates(int brandid){
		return carbrandService.carus(brandid);
	}
		
	@PostMapping("/carbrandupdate")
	public int carbrandupdate(Carbrand carbrand){
		return carbrandService.caru(carbrand);
	}
	
	@PostMapping("/carbrandel")
	public int card(int brandid){
		return carbrandService.card(brandid);
	}
	
	@PostMapping("/selr")
	public Carbrand selr(int cno){
		return carbrandService.selr(cno);
	}
	
	@PostMapping("/carbrands")
	public List<Carbrand> select(String zhi){
		return carbrandService.select(zhi);
	}
	
	@GetMapping("/daochuengine")
	public ResponseEntity<byte []> cars() throws IOException{
		List<Carbrand> list=carbrandService.find();
		Workbook wb=new XSSFWorkbook();
		CellStyle cellStyle = wb.createCellStyle();
		Sheet sheet=wb.createSheet("发动机品牌");
		Row titleRow=sheet.createRow(0);
		titleRow.createCell(0).setCellValue("发动机品牌编码");
		titleRow.createCell(1).setCellValue("发动机品牌名称");
		for (int i = 0; i <list.size(); i++) {
			Row row = sheet.createRow(i+1);
			Cell cellid = row.createCell(0);
			Cell cellname = row.createCell(1);
			cellid.setCellValue(list.get(i).getBrandid());
			cellname.setCellValue(list.get(i).getBrandname());
		}
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		wb.write(baos);
		HttpHeaders headers=new HttpHeaders();
		headers.setContentDispositionFormData("attachment", new String("发动机品牌数据.xlsx".getBytes("utf-8"),"iso-8859-1"));
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(baos.toByteArray(),headers,HttpStatus.OK);
	}
}
