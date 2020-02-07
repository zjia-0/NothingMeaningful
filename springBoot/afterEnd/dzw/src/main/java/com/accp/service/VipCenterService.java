package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Vip;
import com.accp.domain.Viplevel;
import com.accp.mapper.VipMapper;
import com.accp.mapper.ViplevelMapper;

@Service
@Transactional
public class VipCenterService {

	@Autowired
	VipMapper vMapper;
	@Autowired
	ViplevelMapper levelMapper;
	
	public List<Vip> findVipByname(String name){
		return vMapper.findVipByname(name);
	}
	/**
	 * 查询所有会员等级类型
	 */
	public List<Viplevel> findVipType(){
		return levelMapper.selectByExample(null);
	}
	
}
