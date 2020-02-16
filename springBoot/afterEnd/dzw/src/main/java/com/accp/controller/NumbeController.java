package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Numbe;
import com.accp.service.NumbeService;

@RestController
public class NumbeController {
	@Autowired
	NumbeService numbeService;
	
	@PostMapping("/numsel")
	public List<Numbe> numsel(){
		return numbeService.numsel();
	}

}
