package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Bills;
import com.accp.domain.Billstype;
import com.accp.domain.Customer;
import com.accp.domain.Personnel;
import com.accp.service.BalanceService;

@RestController
@RequestMapping("/balance")
public class BalanceController {

	@Autowired
	BalanceService bservice;

	@GetMapping("/queryAllType")
	public List<Billstype> queryTypes() {
		return bservice.queryTypes();
	}

	@GetMapping("/queryCust")
	public List<Customer> queryAllcust() {
		return bservice.queryAllcust();
	}

	@GetMapping("/queryPerson")
	public List<Personnel> queryAllPer() {
		return bservice.queryAllPer();
	}

	@GetMapping("/queryBills")
	public List<Bills> queryAllBills() {
		return bservice.queryAllBills();
	}

	@GetMapping("/findbytj")
	public List<Bills> findbytj( Bills bill){
		return bservice.findbytj(bill);
	}
}
