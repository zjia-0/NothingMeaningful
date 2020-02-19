package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Maintaintype;
import com.accp.mapper.MaintaintypeMapper;

@RestController
public class wangmaintaintypeController {

	@Autowired
	MaintaintypeMapper maintaintypeMapper;
	
	@ResponseBody
	@RequestMapping("/selectMaintaintypewangmali")
	public List<Maintaintype> selectMaintaintypewangmali(){
		return maintaintypeMapper.selectByparentid(0);
	}
}
