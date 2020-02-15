package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Carinfo;
import com.accp.domain.Customer;
import com.accp.mapper.CarinfoMapper;
import com.accp.mapper.CustomerMapper;

/**
 * 客户档案
 * @author ASUS
 *
 */
@Service
@Transactional
public class CustomerService {
	@Autowired
	CustomerMapper customerMapper;
	@Autowired
	CarinfoMapper carinfoMapper;
	
	//查询客户信息
	public List<Customer> query(){
		return customerMapper.query();
	}
	//根据客户ID查询车辆信息
	public List<Carinfo> queryKey(String cno){
		return carinfoMapper.queryCarinfoKey(cno);
	}
}
