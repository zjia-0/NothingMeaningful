package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Place;
import com.accp.service.PlaceService;

@RestController
public class PlaceController {
	@Autowired
	PlaceService placeService;
	
	@PostMapping("/plsel")
	public List<Place> plsel(){
		return placeService.plsel();
	}

}
