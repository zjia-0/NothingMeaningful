package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Personnel;
import com.accp.domain.txml;
import com.accp.mapper.PersonnelMapper;

@Service
@Transactional
public class TxmlService {
//通讯目录
	
	@Autowired 
	PersonnelMapper pmapp;
	
	//查询所有员工
	public List<txml> selecttxml(){
	 return pmapp.txmlselect();	
	}
	
	//修改员工信息
	public int txmlupdate(Personnel per) {
		return pmapp.updateByPrimaryKeySelective(per);
	}
	
	
	//查询单个员工详情
	public txml selecttxmlid(Integer personnelid){
	 return pmapp.txmlselectid(personnelid);	
	}
}
