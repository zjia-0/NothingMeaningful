package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Original;
import com.accp.service.OriginalService;

@RestController
public class OriginalController {
	@Autowired
	OriginalService originalService;
	
	@PostMapping("/origsel")
	public List<Original> origsel(){
		return originalService.origsel();
	}
}
