package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Site;
import com.accp.service.SiteService;

@RestController
public class SiteController {
	@Autowired
	SiteService siteService;
	
	@PostMapping("/sitsel")
	public List<Site> sitsel(){
		return siteService.sitsel();
	}

}
