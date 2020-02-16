package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Goods;
import com.accp.domain.goodsdata;
import com.accp.service.GoodService;

@RestController
public class GoodController {
	@Autowired
	GoodService goodService;
	
	@PostMapping("/goodsel")
	public List<goodsdata> goodsel(){
		return goodService.goodsel();
	}
	
	@PostMapping("/gooddel")
	public int gooddelete(int gid) {
		return goodService.gooddelete(gid);
	}
	
	@PostMapping("/goodsins")
	public int goodsins(Goods goods) {
		return goodService.goodsins(goods);
	}
	
	@PostMapping("/goodupdsel")
	public Goods goodupdsel(int gid) {
		return goodService.goodupdsel(gid);
	}
	
	@PostMapping("/goodupd")
	public int goodupd(Goods goods) {
		return goodService.goodupd(goods);
	}
}
