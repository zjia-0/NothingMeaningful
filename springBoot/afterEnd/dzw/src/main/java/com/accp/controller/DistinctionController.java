package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Distinction;
import com.accp.service.DistinctionService;

@RestController
public class DistinctionController {
	@Autowired
	DistinctionService distinctionService;
	
	@PostMapping("/chas")
	public List<Distinction> sel(){
		return distinctionService.sel();
	}
	
	@PostMapping("/distinctionupdate")
	public int distinctionupdate(Distinction distinction){
		return distinctionService.distinctionupdate(distinction);
	}
}
