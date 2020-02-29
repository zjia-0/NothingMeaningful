package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Bills;
import com.accp.service.WeiXiuService;

@RestController
@RequestMapping("/weixiu")
public class weiXiuController {

	@Autowired
	WeiXiuService weixiuService;
	
	//查询作业中车辆
	@GetMapping("/queryCars")
	public List<Bills> queryCars(){
		return weixiuService.queryCars();
	}
	
	//查询维修历史
	@GetMapping("/weixiuHistory")
	public List<Bills> weixiuHistory(String cdlicense){
		return weixiuService.weixiuHistory(cdlicense);
	}
	
	//查询维修项目
	@GetMapping("/queryProject")
	public List<Bills> queryProject(String cdlicense){
		return weixiuService.queryProject(cdlicense);
	}
	
	//查询领料情况
	@GetMapping("queryLinliao")
	public List<Bills> queryLinliao(String cdlicense){
		return weixiuService.queryLinliao(cdlicense);
	}
	
}
