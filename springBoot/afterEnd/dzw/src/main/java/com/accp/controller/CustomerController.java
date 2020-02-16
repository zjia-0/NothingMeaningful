package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Carinfo;
import com.accp.domain.Customer;
import com.accp.domain.Personnel;
import com.accp.service.CustomerService;
import com.accp.service.VehicleService;

/**
 * 客户档案
 * @author ASUS
 *
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	@Autowired
	VehicleService vehicleService;
	
	//查询所有客户档案
	@GetMapping("/queryCustomer")
	public List<Customer> query(){
		return customerService.query();
	}
	//根据客户编号查询车资料
	@GetMapping("/queryCarinfo")
	public List<Carinfo> queryCarinfo(String cno){
		return customerService.queryKey(cno);
	}
	//模糊查询
	@PostMapping("/queryLike")
	public List<Customer> queryLike(String mohu){
		return customerService.queryLike(mohu);
	}
	//绑定专属顾问下拉框
	@GetMapping("/bindpers")
	public List<Personnel> bindPers(){
		return customerService.bindPers();
	}
	//新增客户
	@PostMapping("/addCus")
	@ResponseBody
	public int addCus(@RequestBody Customer customer) {
		return customerService.addCus(customer);
	}
	//修改客户
	@PostMapping("/updCus")
	@ResponseBody
	public int updCus(@RequestBody Customer customer) {
		return customerService.updCus(customer);
	}
	//删除客户和绑定该客户的车辆信息
	@GetMapping("/delCus")
	public int delCus(String cno) {
		return customerService.delCus(cno);
	}
}
