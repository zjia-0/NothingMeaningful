package com.accp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Banzu;
import com.accp.domain.bzjg;
import com.accp.service.BzjgService;

@RestController
public class BzjgController {

	@Autowired
	BzjgService bser;
	
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
	

}
