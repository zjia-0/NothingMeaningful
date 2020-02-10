package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Incometype;

@RestController
public class IncometypeController {
	@Autowired
	IncometypeService incometypeService;
	
	@PostMapping("/incometypeselect")
	public List<Incometype> incometypeselect(){
		return incometypeService.incometypeselect();
	}

}
