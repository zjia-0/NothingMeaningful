package com.accp.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Post;
import com.accp.domain.Staff;
import com.accp.domain.lldj;
import com.accp.domain.txml;
import com.accp.service.LzdjService;
import com.accp.service.PostService;
import com.accp.service.ZzjgService;


@RestController
@RequestMapping("/exportexcel")
public class ExportController {

	@Autowired
	ZzjgService zser;
	
	@Autowired
	LzdjService lser;
	
	@Autowired
	PostService pservice;
	
	//组织机构 导出
	@GetMapping("/export")
	public ResponseEntity<byte []> exportExcel(String mid) throws IOException{
		List<txml> list = zser.chaxun("0", mid);
		
		Workbook wb = new XSSFWorkbook();//构建新的excel
		Sheet sheet = wb.createSheet("根据部门id查询的员工数据");//创建页签
		
		for(int i = 0; i < list.size(); i++) {
			Row row = sheet.createRow(i);//创建行
			 Cell mid1 = row.createCell(0);
			 Cell mname = row.createCell(1); 
			 Cell pno  = row.createCell(2);
			 Cell pname = row.createCell(3);
			 Cell psex = row.createCell(4);
			 Cell jname = row.createCell(5);
			 Cell shealth = row.createCell(6);
			 Cell sheight = row.createCell(7);
			 Cell splace = row.createCell(8);
			 Cell snation = row.createCell(9);
			 Cell smarry = row.createCell(10);
			 Cell seducation = row.createCell(11);
			 Cell sschool = row.createCell(12);
			 Cell smajor = row.createCell(13);
			 Cell smajorlevel = row.createCell(14);
			 Cell pidcard = row.createCell(15);
			 Cell presidenceaddress = row.createCell(16);
			 Cell pemail = row.createCell(17);
			 Cell paddress = row.createCell(18);
			 Cell pphone = row.createCell(19);
			 Cell ptellphone = row.createCell(20);
			 Cell pemails = row.createCell(21);
			 Cell speople = row.createCell(22);
			 Cell speoplephone = row.createCell(23);
			 Cell sinterniship = row.createCell(24);
			 Cell sindate = row.createCell(25);
			 Cell sbirthday = row.createCell(26);
			 Cell sstarttime = row.createCell(27);
			 Cell sendtime = row.createCell(28);
			 
			  mid1.setCellValue(list.get(i).getPersonnelid());
			  mname.setCellValue(list.get(i).getPersonnelname());
			  pno.setCellValue(list.get(i).getDepartname());
			  pname.setCellValue(list.get(i).getDepartid());
			  psex.setCellValue(list.get(i).getSex());
			  jname.setCellValue(list.get(i).getPost());
			  smajor.setCellValue(list.get(i).getPhysicalstate());
			  smajorlevel.setCellValue(list.get(i).getHeight());
			  pidcard.setCellValue(list.get(i).getBirthplace());
			  presidenceaddress.setCellValue(list.get(i).getNation());
			  pemail.setCellValue(list.get(i).getMartial());
			  paddress.setCellValue(list.get(i).getDegree());
			  pphone.setCellValue(list.get(i).getSchooltag());
			  ptellphone.setCellValue(list.get(i).getDegree());
			  pemails.setCellValue(list.get(i).getCompile());
			  shealth.setCellValue(list.get(i).getCard());
			  sheight.setCellValue(list.get(i).getAddress());
			  splace.setCellValue(list.get(i).getPhone());
			  snation.setCellValue(list.get(i).getEmail());
			  smarry.setCellValue(list.get(i).getEmergencyname());
			  seducation.setCellValue(list.get(i).getEmergencyphone());
			  sschool.setCellValue(list.get(i).getApplicable());
			  speople.setCellValue(list.get(i).getHiredate());
			  speoplephone.setCellValue(list.get(i).getBorndate());
			  sinterniship.setCellValue(list.get(i).getEnddate());
//			  sindate.setCellValue(list.get(i).get);
//			  sbirthday.setCellValue(list.get(i).getSbirthday());
//			  sstarttime.setCellValue(list.get(i).getSstarttime());
//			  sendtime.setCellValue(list.get(i).getSendtime());
		}
		//讲excel写入bytearray...中
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		wb.write(baos);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentDispositionFormData("attachment",new String("根据部门id查询的员工数据".getBytes("utf-8"),"iso-8859-1"));
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(baos.toByteArray(),headers,HttpStatus.OK);
	}
	
	
	
	//离职登记 导出
	@GetMapping("/exportlzdj")
	public ResponseEntity<byte []> lzdjexport() throws IOException{
		List<lldj> lists = lser.lzdjselect();
		
		Workbook wb = new XSSFWorkbook();//构建新的excel
		Sheet sheet = wb.createSheet("导出离职的人员");//创建页签
		
		for(int i = 0; i < lists.size(); i++) {
			Row row = sheet.createRow(i);//创建行
			 Cell departname = row.createCell(0);
			 Cell staffid = row.createCell(1); 
			 Cell name  = row.createCell(2);
			 Cell sex = row.createCell(3);
			 Cell post = row.createCell(4);
			 Cell dimissiondate = row.createCell(5);
			 Cell cause = row.createCell(6);


			 
			 departname.setCellValue(lists.get(i).getDepartname());
			 staffid.setCellValue(lists.get(i).getStaffid());
			  name.setCellValue(lists.get(i).getName());
			  sex.setCellValue(lists.get(i).getSex());
			  post.setCellValue(lists.get(i).getPost());
			  dimissiondate.setCellValue(lists.get(i).getDimissiondate());
			  cause.setCellValue(lists.get(i).getCause());
		
		}
		//讲excel写入bytearray...中
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		wb.write(baos);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentDispositionFormData("attachment",new String("导出离职的人员".getBytes("utf-8"),"iso-8859-1"));
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(baos.toByteArray(),headers,HttpStatus.OK);
	}
	
	//岗位定义 导出
	@GetMapping("/exportgwdy")
	public ResponseEntity<byte []> gwdyexport() throws IOException{
		List<Post> lists = pservice.select();
		
		Workbook wb = new XSSFWorkbook();//构建新的excel
		Sheet sheet = wb.createSheet("导出所有的岗位");//创建页签
		
		for(int i = 0; i < lists.size(); i++) {
			Row row = sheet.createRow(i);//创建行
			 Cell postid = row.createCell(0);
			 Cell postname = row.createCell(1); 
;


			 
postid.setCellValue(lists.get(i).getPostid());
postname.setCellValue(lists.get(i).getPostname());

		}
		//讲excel写入bytearray...中
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		wb.write(baos);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentDispositionFormData("attachment",new String("导出所有的岗位".getBytes("utf-8"),"iso-8859-1"));
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(baos.toByteArray(),headers,HttpStatus.OK);
	}
}
