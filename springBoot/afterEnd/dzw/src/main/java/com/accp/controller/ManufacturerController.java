package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Manufacturer;
import com.accp.service.ManufacturerServie;

@RestController
public class ManufacturerController {
	
	@Autowired
	ManufacturerServie manufacturerServie;
	
	@PostMapping("/manufacturersel")
	public List<Manufacturer> manufacturersel(){
		return manufacturerServie.manufacturersel();
	}
	
}
