package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Carinfo;
import com.accp.domain.Customer;
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
	
	@GetMapping("/queryCustomer")
	public List<Customer> query(){
		return customerService.query();
	}
	@GetMapping("/queryCarinfo")
	public List<Carinfo> queryCarinfo(String cno){
		return customerService.queryKey(cno);
	}
}
