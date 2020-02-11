package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Artisanstars;
import com.accp.service.JgxjService;

@RestController
public class Jgxjcontroller {
//技工星级
	@Autowired
	JgxjService jService;
	
	@PostMapping("/Jselect")
	public List<Artisanstars> select(){
		return jService.select();
	}
	
	//根据点击进行单个查询
	@PostMapping("/selectid")
	public Artisanstars selectid(int starleveid) {
		System.out.println(starleveid);
		return jService.selectid(starleveid);
	}
	
	//修改
	@PostMapping("/artupdate")
	public int ArtisanstarsUpdate(Artisanstars starleve) {
		return jService.ArtisanstarsUpdate(starleve);
	}
	
	//新增
	@PostMapping("/artadd")
	public int ArtisanstarsAdd(Artisanstars art) {
		return jService.ArtisanstarsAdd(art);
	}
	
	//删除
	@PostMapping("/artRemove")
	public int ArtisanstarsRemove(int starleveid) {
		return jService.ArtisanstarsRemove(starleveid);
	}
}
