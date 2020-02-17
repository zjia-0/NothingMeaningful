package com.accp.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Customer;
import com.accp.domain.Vip;
import com.accp.domain.Viplevel;
import com.accp.service.VipCenterService;

@RestController
@RequestMapping("/vip")
public class VipController {

	@Autowired
	VipCenterService Vservice;
	
	@GetMapping("/find")
	public List<Vip> findByName(@PathParam("name")String name){
		if(name==""||name==null) {
			name=null;
		}else {
			name="%"+name+"%";
		}
		return Vservice.findVipByname(name);
	}
	@GetMapping("/type")
	public List<Viplevel> findVipType(){
		return Vservice.findVipType();
	}
	@GetMapping("/findCno")
	public int findCno() {
		return Vservice.findMaxCno();
	}
	@GetMapping("/findjifen")
	public int findJifen(@PathParam("levelid")Integer levelid) {
		return Vservice.queryStartJifen(levelid);
	}
	@PostMapping("/addVip")
	public int addVip(Customer cust) {
		return Vservice.addCustomer(cust);
	}
	@PostMapping("/addVips")
	public int addVips(Vip vip) {
		return Vservice.addVip(vip);
	}
	@PutMapping("/upzt")
	public int upZt(String vno) {
		return Vservice.upZt(vno);
	}
	@PutMapping("/upJifen")
	public int upJifen(String vno) {
		return Vservice.upJifen(vno);
	}
	@PutMapping("/upMoney")
	public int upMoney(@RequestBody Vip vip) {
		double price=vip.getMoney();
		vip.setCurrentjifen((int)(price*0.1));
		return Vservice.upMoney(vip);
	}
	@GetMapping("/queryAllcust")
	public List<Customer> queryAllcust(){
		return Vservice.queryAllcust();
	}
	@GetMapping("/findisok")
	public boolean isok(String cno) {
		return Vservice.queryIsok(cno);
	}
} 
