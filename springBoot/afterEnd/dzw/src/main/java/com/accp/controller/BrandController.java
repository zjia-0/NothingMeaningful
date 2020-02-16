package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Brand;
import com.accp.service.BrandService;

@RestController
public class BrandController {
	@Autowired
	BrandService brandService;
	
	@PostMapping("/brandsel")
	public List<Brand> brandsel(){
		return brandService.brandsel();
	}

}
