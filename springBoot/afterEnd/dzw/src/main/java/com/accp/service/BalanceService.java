package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Bills;
import com.accp.domain.Billstype;
import com.accp.domain.Customer;
import com.accp.domain.Personnel;
import com.accp.mapper.BillsMapper;
import com.accp.mapper.BillstypeMapper;
import com.accp.mapper.CustomerMapper;
import com.accp.mapper.PersonnelMapper;

@Service
@Transactional
public class BalanceService {

	@Autowired
	CustomerMapper custMapper;
	@Autowired
	PersonnelMapper personMapper;
	@Autowired
	BillstypeMapper bMapper;
	@Autowired
	BillsMapper billMapper;
	
	public List<Customer> queryAllcust(){
		return custMapper.selectByExample(null);
	}
	public List<Personnel> queryAllPer(){
		return personMapper.selectByExample(null);
	}
	public List<Billstype> queryTypes(){
		return bMapper.selectByExample(null);
	}
	public List<Bills> queryAllBills(){
		return billMapper.findAllBills();
	}
	
}
