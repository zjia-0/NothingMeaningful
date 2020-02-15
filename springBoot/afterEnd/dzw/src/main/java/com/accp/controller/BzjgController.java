package com.accp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Banzu;
import com.accp.domain.Personnel;
import com.accp.domain.bzjg;
import com.accp.service.BzjgService;
import com.accp.service.ZzjgService;

@RestController
public class BzjgController {

	@Autowired
	BzjgService bser;
	
	@Autowired
	ZzjgService zser;
	
	//查询班组树状图
	@RequestMapping("/bzszt")
	public List<Banzu> chaxunszt(){
		return bser.chaxunszt();
	}
	
	//根据班组查询小组
	@RequestMapping("/xiaozu")
	public List<Banzu> chabanzu(String banzuid){
		return bser.chabanzu(banzuid);
	}
	
	//查询技工
	@RequestMapping("/bzgjselect")
	public List<bzjg> bzgjselect(String remark2,String banzuid){
		return bser.bzgjselect(remark2,banzuid);
	}
	

	//新增员工
	@RequestMapping("/addjg")
	public int addjg(Personnel per,String workid,String stars,String craft,String brand,String remark1,String remark2) {
		return bser.addjg(per, workid, stars, craft, brand, remark1, remark2);
	}
	
	//新增模态框查询班组id
	@RequestMapping("/addbanzuid")
	public Banzu addbanzuid(String id) {
			return bser.addbanzuid(id);
	}
	
	//根据id查询技工修改
	@RequestMapping("/jgxiugaiid")
	public bzjg jgxiugai(String workid) {
		return bser.jgxiugai(workid);
	}
	


	//修改员工
	@RequestMapping("/updatejg")
	public int updatejg(Personnel per,String workid,String stars,String craft,String brand,String remark1,String remark2) {
		return bser.updatejg(per, workid, stars, craft, brand, remark1, remark2);
	}
	
}
