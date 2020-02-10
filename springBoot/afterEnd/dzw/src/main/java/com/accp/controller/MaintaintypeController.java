package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Maintaintype;
import com.accp.mapper.MaintaintypeMapper;
import com.accp.service.MaintaintypeService;

@RestController
public class MaintaintypeController {
	@Autowired
	MaintaintypeService maintaintypeService;
	
	@PostMapping("/maintaintypeselect")
	public List<Maintaintype> maintaintypeselect(){
		return maintaintypeService.maintaintypeselect();
	}

}
