package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Store;
import com.accp.mapper.StoreMapper;

@RestController
public class storeController {
	@Autowired
	StoreMapper storeMapper;
	
	@RequestMapping("/chanshan")
	public List<Store> cha(){
		return storeMapper.selectByExample(null);
	}
}
