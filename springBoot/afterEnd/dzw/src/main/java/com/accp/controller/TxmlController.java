package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Personnel;
import com.accp.domain.txml;
import com.accp.service.TxmlService;

@RestController
public class TxmlController {
//通讯目录
	@Autowired
	TxmlService tser;
	
	//查询所有员工
	@RequestMapping("/txmlselect")
	public List<txml> selecttxml(){
			return tser.selecttxml();
	}
	
	//修改员工信息
	@RequestMapping("/txmlupdate")
	public int txmlupdate(Personnel per) {
		return tser.txmlupdate(per);
	}
	

	//查询单个员工详情
	@RequestMapping("/txmlid")
	public txml selecttxmlid(Integer personnelid){
		return tser.selecttxmlid(personnelid);
	}
}
