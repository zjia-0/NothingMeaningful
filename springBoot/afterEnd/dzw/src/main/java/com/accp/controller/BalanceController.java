package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Account;
import com.accp.domain.Bills;
import com.accp.domain.Billstype;
import com.accp.domain.Customer;
import com.accp.domain.Invoice;
import com.accp.domain.InvoiceType;
import com.accp.domain.Personnel;
import com.accp.domain.Vip;
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
	public List<Bills> findbytj(Bills bill) {
		return bservice.findbytj(bill);
	}

	@GetMapping("/findAllInvocetype")
	public List<InvoiceType> findAllInvoice() {
		return bservice.findAllInvoice();
	}

	@GetMapping("/findByBid")
	public Account findByBid(String bid) {
		List<Account> list = bservice.findByBid(bid);
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@GetMapping("/findByCno")
	public Vip findByCno(String cno) {
		List<Vip> list = bservice.findByCno(cno);
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@PutMapping("/updateAcc")
	public int updateAccount(@RequestBody Account account) {
		return bservice.updateAccount(account);
	}

	@PostMapping("/addInvoice")
	public int addInvoice(@RequestBody Invoice invoice) {
		return bservice.addInvoice(invoice);
	}
	
	@PutMapping("/updateVips")
	public int updateVip(@RequestBody Vip vip) {
		return bservice.updateVip(vip);
	}
	
	@PutMapping("/rolleback")
	public int rolleBack(String bid) {
		return bservice.rolleBack(bid);
	}
}
