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

import com.accp.domain.Supplierparty;
import com.accp.domain.Vendor;
import com.accp.service.SupplierpartyService;

@RestController
public class SupplierpartyController {
	@Autowired
	SupplierpartyService supplierpartyService;
	
	@PostMapping("/supplierpartysel")
	public List<Supplierparty> supplierpartysel(){
		return supplierpartyService.supplierpartysel();
	}
	
	@PostMapping("/vensel")
	public List<Vendor> vensel(String supcode,String supname,String address,String way,String grade,String brand,String unitsname,String contacts,
			   String phone,String mobile,String scase,String remark,String chazhi){
		return supplierpartyService.vensel(supcode, supname, address, way, grade, brand, unitsname, contacts, phone, mobile, scase, remark, chazhi);
	}
	
	@GetMapping("/daochuvensel")
	public ResponseEntity<byte []> cars() throws IOException{
		List<Vendor> list=supplierpartyService.find();
		Workbook wb=new XSSFWorkbook();
		CellStyle cellStyle = wb.createCellStyle();
		Sheet sheet=wb.createSheet("供货商单位");
		Row titleRow=sheet.createRow(0);
		titleRow.createCell(0).setCellValue("厂商代码");
		titleRow.createCell(1).setCellValue("厂商名称");
		titleRow.createCell(2).setCellValue("地址");
		titleRow.createCell(3).setCellValue("经营情况");
		titleRow.createCell(4).setCellValue("网址");
		titleRow.createCell(5).setCellValue("开户行");
		titleRow.createCell(6).setCellValue("银行账户");
		titleRow.createCell(7).setCellValue("付款方式");
		titleRow.createCell(8).setCellValue("厂商等级");
		titleRow.createCell(9).setCellValue("经营品牌");
		titleRow.createCell(10).setCellValue("厂商类别");
		titleRow.createCell(11).setCellValue("联系人");
		titleRow.createCell(12).setCellValue("电话");
		titleRow.createCell(13).setCellValue("手机");
		titleRow.createCell(14).setCellValue("Email");
		titleRow.createCell(15).setCellValue("账期");
		titleRow.createCell(16).setCellValue("备注");
		for (int i = 0; i <list.size(); i++) {
			Row row = sheet.createRow(i+1);
			Cell supcode = row.createCell(0);
			Cell supname = row.createCell(1);
			Cell address = row.createCell(2);
			Cell scase = row.createCell(3);
			Cell url = row.createCell(4);
			Cell bank = row.createCell(5);
			Cell banknum = row.createCell(6);
			Cell way = row.createCell(7);
			Cell grade = row.createCell(8);
			Cell brand = row.createCell(9);
			Cell unitsname = row.createCell(10);
			Cell contacts = row.createCell(11);
			Cell phone = row.createCell(12);
			Cell mobile = row.createCell(13);
			Cell email = row.createCell(14);
			Cell days = row.createCell(15);
			Cell remark = row.createCell(16);
			supcode.setCellValue(list.get(i).getSupcode());
			supname.setCellValue(list.get(i).getSupname());
			address.setCellValue(list.get(i).getAddress());
			scase.setCellValue(list.get(i).getScase());
			url.setCellValue(list.get(i).getUrl());
			bank.setCellValue(list.get(i).getBank());
			banknum.setCellValue(list.get(i).getBanknum());
			way.setCellValue(list.get(i).getWay());
			grade.setCellValue(list.get(i).getGrade());
			brand.setCellValue(list.get(i).getBrand());
			unitsname.setCellValue(list.get(i).getUnitsname());
			contacts.setCellValue(list.get(i).getContacts());
			phone.setCellValue(list.get(i).getPhone());
			mobile.setCellValue(list.get(i).getMobile());
			email.setCellValue(list.get(i).getEmail());
			days.setCellValue(list.get(i).getDays());
			remark.setCellValue(list.get(i).getRemark());
		}
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		wb.write(baos);
		HttpHeaders headers=new HttpHeaders();
		headers.setContentDispositionFormData("attachment", new String("供货商单位数据.xlsx".getBytes("utf-8"),"iso-8859-1"));
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(baos.toByteArray(),headers,HttpStatus.OK);
	}
	
	@PostMapping("/supplierpartyinsert")
	public int supplierpartyinsert(Supplierparty supplierparty) {
		return supplierpartyService.supplierpartyinsert(supplierparty);
	}
	
	@PostMapping("/supplierpartydelete")
	public int supplierpartydelete(int supid) {
		return supplierpartyService.supplierpartydelete(supid);
	}
	
	@PostMapping("/supplierpartyupdatesel")
	public Supplierparty supplierpartyupdatesel(int supid) {
		return supplierpartyService.supplierpartyupdatesel(supid);
	}
	
	@PostMapping("/supplierpartyupdate")
	public int supplierpartyupdate(Supplierparty supplierparty) {
		return supplierpartyService.supplierpartyupdate(supplierparty);
	}
	
	
}
