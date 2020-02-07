package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Carbrandinfo;
import com.accp.service.CarbrandinfoService;

@RestController
public class CarbrandinfoController {

	@Autowired
	CarbrandinfoService carbrandinfoService;
	
	@PostMapping("/sel")
	public List<Carbrandinfo> sel(String con){
		return carbrandinfoService.sel(con);
	}
	
	@PostMapping("/carbrandinfodelet")
	public int carbrandinfodelet(String cid) {
		return carbrandinfoService.carbrandinfodelet(cid);
	}
}
