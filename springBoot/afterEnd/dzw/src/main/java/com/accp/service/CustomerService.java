package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Carinfo;
import com.accp.domain.CarinfoExample;
import com.accp.domain.Customer;
import com.accp.domain.Personnel;
import com.accp.mapper.CarinfoMapper;
import com.accp.mapper.CustomerMapper;
import com.accp.mapper.PersonnelMapper;

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
	@Autowired
	PersonnelMapper personnelMapper;
	
	//查询客户信息
	public List<Customer> query(){
		return customerMapper.query();
	}
	//根据客户ID查询车辆信息
	public List<Carinfo> queryKey(String cno){
		return carinfoMapper.queryCarinfoKey(cno);
	}
	//根据姓名，电话，会员卡号，车牌号模糊查询
	public List<Customer> queryLike(String mohu){
		return customerMapper.queryLike(mohu);
	}
	//绑定专属顾问下拉框
	public List<Personnel> bindPers(){
		return personnelMapper.selectByExample(null);
	}
	//新增客户
	public int addCus(Customer customer) {
		return customerMapper.insert(customer);
	}
	//修改客户
	public int updCus(Customer customer) {
		return customerMapper.updateByPrimaryKey(customer);
	}
	//删除客户同时删除绑定该客户的车辆信息
	public int delCus(String cno) {
		CarinfoExample ce=new CarinfoExample();
		ce.createCriteria().andCnoEqualTo(cno);
		carinfoMapper.deleteByExample(ce);
		
		return customerMapper.deleteByPrimaryKey(cno);
	}
}
