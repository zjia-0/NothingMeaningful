package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Permissions;
import com.accp.service.JurisdictionServie;

@RestController
@RequestMapping("/per")
public class JurisdictionController {

	@Autowired
	JurisdictionServie JService;
	
	@GetMapping("/perms")
	public List<Permissions> queryAll(){
		return JService.queryAll();
	}
}
