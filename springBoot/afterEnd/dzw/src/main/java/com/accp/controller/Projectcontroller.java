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
import com.accp.domain.Project;
import com.accp.domain.projectwang;
import com.accp.service.ProjectService;

@RestController
public class Projectcontroller {
	@Autowired
	ProjectService projectService;
	
	@PostMapping("/projectselect")
	public List<projectwang> projectselect(String pname,String typename){
		return projectService.projectselect(pname, typename);
	}
	
	@GetMapping("/daochuproject")
	public ResponseEntity<byte []> car() throws IOException{
		List<projectwang> list=projectService.find();
		Workbook wb=new XSSFWorkbook();
		CellStyle cellStyle = wb.createCellStyle();
		Sheet sheet=wb.createSheet("商品资料");
		Row titleRow=sheet.createRow(0);
		titleRow.createCell(0).setCellValue("项目类别");
		titleRow.createCell(1).setCellValue("项目编码");
		titleRow.createCell(2).setCellValue("项目名称");
		titleRow.createCell(3).setCellValue("收入种类");
		titleRow.createCell(4).setCellValue("标准价");
		titleRow.createCell(5).setCellValue("会员价");
		titleRow.createCell(6).setCellValue("vip价");
		titleRow.createCell(7).setCellValue("协议价");
		titleRow.createCell(8).setCellValue("索赔价");
		titleRow.createCell(9).setCellValue("保险价");
		for (int i = 0; i <list.size(); i++) {
			Row row = sheet.createRow(i+1);
			Cell typename = row.createCell(0);
			Cell pnum = row.createCell(1);
			Cell pname = row.createCell(2);
			Cell incomename = row.createCell(3);
			Cell standardprice = row.createCell(4);
			Cell memberprice = row.createCell(5);
			Cell vipprice = row.createCell(6);
			Cell dealprice = row.createCell(7);
			Cell claimprice = row.createCell(8);
			Cell insuranceprice = row.createCell(9);
			
			typename.setCellValue(list.get(i).getTypename());
			pnum.setCellValue(list.get(i).getPnum());
			pname.setCellValue(list.get(i).getPname());
			incomename.setCellValue(list.get(i).getIncomename());
			standardprice.setCellValue(list.get(i).getStandardprice());
			memberprice.setCellValue(list.get(i).getMemberprice());
			vipprice.setCellValue(list.get(i).getVipprice());
			dealprice.setCellValue(list.get(i).getDealprice());
			claimprice.setCellValue(list.get(i).getClaimprice());
			insuranceprice.setCellValue(list.get(i).getStandardprice());
			
		}
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		wb.write(baos);
		HttpHeaders headers=new HttpHeaders();
		headers.setContentDispositionFormData("attachment", new String("维修项目数据.xlsx".getBytes("utf-8"),"iso-8859-1"));
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(baos.toByteArray(),headers,HttpStatus.OK);
	}
	
	@PostMapping("/projectdelete")
	public int  projectdelete(int id) {
		return projectService.projectdelete(id);
	}
	
	@PostMapping("/projectinsert")
	public int projectinsert(Project project) {
		return projectService.projectinsert(project);
	}
	
	@PostMapping("/projectupdate")
	public int projectupdate(Project project) {
		return projectService.projectupdate(project);
	}
	
	@PostMapping("/projectupse")
	public Project projectupse(int id) {
		return projectService.projectupse(id);
	}
	
}
