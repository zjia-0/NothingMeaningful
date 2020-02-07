package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Permissions;
import com.accp.domain.Roles;
import com.accp.service.JurisdictionServie;

@RestController
@RequestMapping("/per")
public class JurisdictionController {

	@Autowired
	JurisdictionServie JService;
	
	@GetMapping("/per")
	public List<Permissions> queryAlls(){
		return JService.queryAlls();
	}
	@GetMapping("/findRoles")
	public List<Roles> queryRoles(){
		return JService.queryRoles();
	}
}
