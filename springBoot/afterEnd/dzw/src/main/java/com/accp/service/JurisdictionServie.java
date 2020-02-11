package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Permissions;
import com.accp.domain.Roles;
import com.accp.domain.RolesPerms;
import com.accp.domain.RolesPermsExample;
import com.accp.mapper.PermissionsMapper;
import com.accp.mapper.RolesMapper;
import com.accp.mapper.RolesPermsMapper;

@Service
public class JurisdictionServie {
	@Autowired
	PermissionsMapper pMapper;
	@Autowired
	RolesMapper rMapper;
	@Autowired
	RolesPermsMapper rpMapper;
	
	public List<Permissions> queryAlls(){
		return pMapper.selectByExample(null);
	}
	public List<Roles> queryRoles(){
		return rMapper.selectByExample(null);
	}
	public List<RolesPerms> queryPerByRoles(Integer rid){
		RolesPermsExample example =new RolesPermsExample();
		example.createCriteria().andRidEqualTo(rid);
		return rpMapper.selectByExample(example);
	}
	public int addPer(List<RolesPerms> list) {
		int isok=0;
		RolesPermsExample example=new RolesPermsExample();
		example.createCriteria().andRidEqualTo(list.get(0).getRid());
		rpMapper.deleteByExample(example);
		for (RolesPerms per : list) {
			isok=rpMapper.insert(per);
		}
		return isok;
	}
	public int delPer(Integer rid) {
		RolesPermsExample example=new RolesPermsExample();
		example.createCriteria().andRidEqualTo(rid);
		return rpMapper.deleteByExample(example);
	}
	
	
}
