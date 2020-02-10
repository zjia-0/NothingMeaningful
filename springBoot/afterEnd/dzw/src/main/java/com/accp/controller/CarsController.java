package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Cars;
import com.accp.service.CarsService;

@RestController
public class CarsController {//外勤车辆
	
	@Autowired
	CarsService cser;
	
	@PostMapping("/carsselect")
	public List<Cars> select(){
		return cser.select();
	}
	
	//根据点击进行单个查询
		@PostMapping("/carids")
		public Cars selectid(int carid) {
			
			return cser.selectid(carid);
		}
		
		//修改
		@PostMapping("/carsupdate")
		public int ArtisanstarsUpdate(Cars starleve) {
			return cser.ArtisanstarsUpdate(starleve);
		}
		
		//新增
		@PostMapping("/carsadd")
		public int ArtisanstarsAdd(Cars art) {
			return cser.ArtisanstarsAdd(art);
		}
		
		//删除
		@PostMapping("/carsRemove")
		public int ArtisanstarsRemove(int carid) {
			return cser.ArtisanstarsRemove(carid);
		}
}
