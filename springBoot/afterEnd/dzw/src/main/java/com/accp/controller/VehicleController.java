package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Carbelong;
import com.accp.domain.Carinfo;
import com.accp.domain.Customer;
import com.accp.domain.Engine;
import com.accp.domain.Fuel;
import com.accp.domain.Insurance;
import com.accp.service.VehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

	@Autowired
	VehicleService vehicleService;
	
	//查询所有车资料
	@GetMapping("/queryCarinfo")
	public List<Carinfo> queryCarinfo(){
		return vehicleService.queryCarinfo();
	}
	//模糊查询
	@GetMapping("/queryLike")
	public List<Carinfo> queryLike(String mohu,String chepai,String chejia){
		System.out.println(mohu+"-"+chepai+"-"+chejia);
		return vehicleService.queryLike(mohu, chepai, chejia);
	}
	//根据车资料查询客户信息
	@GetMapping("/queryCustomerKey")
	public List<Customer> queryCustomer(String cno){
		return vehicleService.queryCustomer(cno);
	}
	//新增绑定下拉框
		@GetMapping("/bindCarbelong")
		public List<Carbelong> bindCarbelong(){
			return vehicleService.bindCarbelong();
		}
		@GetMapping("/bindEngine")
		public List<Engine> bindEngine(){
			return vehicleService.bindEngine();
		}
		@GetMapping("/bindFuel")
		public List<Fuel> bindFuel(){
			return vehicleService.bindFuel();
		}
		@GetMapping("/bindInsurance")
		public List<Insurance> bindInsurance(){
			return vehicleService.bindInsurance();
		}
	//新增车辆信息
	@GetMapping("/insertCarinfo")
	public int insertCarinfo(Carinfo carinfo) {
		return vehicleService.insertCarinfo(carinfo);
	}
	//修改车辆信息
	@GetMapping("/updateCarinfo")
	public int updateCarinfo(Carinfo carinfo) {
		return vehicleService.updateCarinfo(carinfo);
	}
	//删除车辆信息
	@GetMapping("/deleteCarinfo")
	public int deleteCarinfo(String cdlicense) {
		return vehicleService.deleteCarinfo(cdlicense);
	}
	//按驾驶员姓名/简码/手机/车牌号模糊查询
	//按车牌号与车架号多条件查询
}
