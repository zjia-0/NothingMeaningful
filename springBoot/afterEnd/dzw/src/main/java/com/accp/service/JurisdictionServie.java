package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Permissions;
import com.accp.domain.Roles;
import com.accp.mapper.PermissionsMapper;
import com.accp.mapper.RolesMapper;

@Service
public class JurisdictionServie {
	@Autowired
	PermissionsMapper pMapper;
	@Autowired
	RolesMapper rMapper;
	
	public List<Permissions> queryAlls(){
		return pMapper.selectByExample(null);
	}
	public List<Roles> queryRoles(){
		return rMapper.selectByExample(null);
	}
	
	
}
