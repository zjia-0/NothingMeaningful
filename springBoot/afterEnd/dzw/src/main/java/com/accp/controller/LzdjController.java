package com.accp.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Dimission;
import com.accp.domain.Store;
import com.accp.domain.lldj;
import com.accp.domain.txml;
import com.accp.service.LzdjService;

@RestController
public class LzdjController {
//离职登记
	@Autowired
	LzdjService lser;
	
	@RequestMapping("/lzdjselect")
	public List<lldj> lzdjselect(){
		return lser.lzdjselect();
	}
	
	
	//员工查询
	@RequestMapping("/yuangong")
	public List<txml> yuangong(Integer storeid){
		int id=0;
		if (storeid!=null) {
			id=storeid;
		}
		return lser.yuangong(id);
	}
	
	
	//门店下拉框
	@RequestMapping("/mendian")
	public List<Store> mendian(){
		return lser.mendian();
	}
	
	//新增离职人员
	@RequestMapping("/lizhi")
	public int lizhi(String staffid,String dimissiondates,String causes ) {
		return lser.lizhi(staffid, dimissiondates, causes);
	}
	
	
	//离职人员回滚
	@RequestMapping("/huigun")
	public int huigun(Dimission record ) {
		return lser.huigun(record);
	}
	
	//删除
	@RequestMapping("/rempve")
	public int remove(int dimissionid ) {
			return lser.remove(dimissionid);
	}
	
	//打开查看详情
	@RequestMapping("/dakai")
	public txml dakai(int personnelid) {
		
		return lser.dakai(personnelid);
	}
}
