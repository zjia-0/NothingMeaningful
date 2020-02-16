package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Price;
import com.accp.service.PriceService;

@RestController
public class PriceController {
	@Autowired
	PriceService priceService;
	
	@PostMapping("/pricesel")
	public List<Price> pricesel(){
		return priceService.pricesel();
	}
}
