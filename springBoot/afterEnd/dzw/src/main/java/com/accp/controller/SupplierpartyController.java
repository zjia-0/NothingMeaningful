package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Supplierparty;
import com.accp.domain.Vendor;
import com.accp.service.SupplierpartyService;

@RestController
public class SupplierpartyController {
	@Autowired
	SupplierpartyService supplierpartyService;
	
	@PostMapping("/supplierpartysel")
	public List<Supplierparty> supplierpartysel(){
		return supplierpartyService.supplierpartysel();
	}
	
	@PostMapping("/vensel")
	public List<Vendor> vensel(){
		return supplierpartyService.vensel();
	}
	
	@PostMapping("/supplierpartyinsert")
	public int supplierpartyinsert(Supplierparty supplierparty) {
		return supplierpartyService.supplierpartyinsert(supplierparty);
	}
	
	@PostMapping("/supplierpartydelete")
	public int supplierpartydelete(int supid) {
		return supplierpartyService.supplierpartydelete(supid);
	}
	
	@PostMapping("/supplierpartyupdatesel")
	public Supplierparty supplierpartyupdatesel(int supid) {
		return supplierpartyService.supplierpartyupdatesel(supid);
	}
	
	@PostMapping("/supplierpartyupdate")
	public int supplierpartyupdate(Supplierparty supplierparty) {
		return supplierpartyService.supplierpartyupdate(supplierparty);
	}
	
	
}
