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
	public List<Carbrandinfo> sel(String cno,String cxbh){
		return carbrandinfoService.sel(cno, cxbh);
	}
	
	@PostMapping("/carbrandinfodelet")
	public int carbrandinfodelet(String cid) {
		return carbrandinfoService.carbrandinfodelet(cid);
	}
	
	@PostMapping("/carbrandinfoinsert")
	public int carbrandinfodelet(Carbrandinfo carbrandinfo) {
		return carbrandinfoService.carbrandinfoinsert(carbrandinfo);
	}
	
	@PostMapping("/carbrandinfoupdate")
	public int carbrandinfoupdate(Carbrandinfo carbrandinfo) {
		return carbrandinfoService.carbrandinfoupdate(carbrandinfo);
	}
	
	@PostMapping("/selrs")
	public Carbrandinfo selrs(String cid) {
		return carbrandinfoService.selrs(cid);
	}
}
