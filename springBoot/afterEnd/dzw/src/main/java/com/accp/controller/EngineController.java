package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Engine;
import com.accp.service.EngineService;

@RestController
public class EngineController {
	@Autowired
	EngineService engineService;
	
	@PostMapping("/engine")
	public List<Engine> en(){
		return engineService.en();
	}
	
	@PostMapping("/enginedelete")
	public int end(int motorid){
		return engineService.end(motorid);
	}
	
	@PostMapping("/engineinsert")
	public int eni(Engine engine){	
		return engineService.eni(engine);
	}
	
	@PostMapping("/engineupdate")
	public int enu(Engine engine){			
		return engineService.enu(engine);
	}
	
	
}









