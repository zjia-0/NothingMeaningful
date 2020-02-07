package com.accp.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Vip;
import com.accp.domain.Viplevel;
import com.accp.service.VipCenterService;

@RestController
@RequestMapping("/vip")
public class VipController {

	@Autowired
	VipCenterService Vservice;
	
	@GetMapping("/find")
	public List<Vip> findByName(@PathParam("name")String name){
		if(name==""||name==null) {
			name=null;
		}else {
			name="%"+name+"%";
		}
		return Vservice.findVipByname(name);
	}
	@GetMapping("/type")
	public List<Viplevel> findVipType(){
		return Vservice.findVipType();
	}
	
}
