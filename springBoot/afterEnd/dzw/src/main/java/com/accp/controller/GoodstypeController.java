package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Goodstype;
import com.accp.domain.Supplier;
import com.accp.mapper.GoodstypeMapper;

@RestController
public class GoodstypeController {
	@Autowired
	GoodstypeMapper goodstypeMapper;
	
	@ResponseBody
	@RequestMapping("/selectgoodstypeMapperwangmali")
	public List<Goodstype> select(){
		return goodstypeMapper.select(0);
	}
}
