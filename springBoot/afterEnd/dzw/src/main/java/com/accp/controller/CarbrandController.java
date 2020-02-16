package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Carbrand;
import com.accp.service.CarbrandService;

@RestController
public class CarbrandController {
	@Autowired
	CarbrandService carbrandService;
	
	@PostMapping("/carbrand")
	public List<Carbrand> car(){
		return carbrandService.car();
	}
	
	@PostMapping("/fdjpps")
	public List<Carbrand> fdjpp(){
		return carbrandService.car();
	}
	
	@PostMapping("/carbrandinsert")
	public int carbrandinsert(Carbrand carbrand){
		return carbrandService.cari(carbrand);
	}
	
	@PostMapping("/updates")
	public Carbrand carbrandupdates(int brandid){
		return carbrandService.carus(brandid);
	}
		
	@PostMapping("/carbrandupdate")
	public int carbrandupdate(Carbrand carbrand){
		return carbrandService.caru(carbrand);
	}
	
	@PostMapping("/carbrandel")
	public int card(int brandid){
		return carbrandService.card(brandid);
	}
	
	@PostMapping("/selr")
	public Carbrand selr(int cno){
		return carbrandService.selr(cno);
	}
	
	@PostMapping("/carbrands")
	public List<Carbrand> select(String zhi){
		return carbrandService.select(zhi);
	}
}
