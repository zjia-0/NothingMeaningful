package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Permissions;
import com.accp.mapper.PermissionsMapper;

@Service
public class JurisdictionServie {
	@Autowired
	PermissionsMapper pMapper;
	public List<Permissions> queryAll(){
		List<Permissions> lists = pMapper.selectByExample(null);
		System.out.println("aw"+lists.size());
		Permissions parentPerms = new Permissions();
		parentPerms.setId(0);
		each(parentPerms, lists);
		return parentPerms.getChildrens();
	}
	
	public void each(Permissions parentPerms,List<Permissions> perms){
		for(Permissions p : perms) {
			if(p.getParentid() == parentPerms.getId()) {
				Permissions newPerms = new Permissions();
				newPerms.setId(p.getId());
				newPerms.setCatalog(p.getCatalog());
				newPerms.setEname(p.getEname());
				newPerms.setName(p.getName());
				newPerms.setParentid(p.getParentid());
				newPerms.setPath(p.getPath());
				parentPerms.getChildrens().add(newPerms);
				each(newPerms,perms);
			}
		}
	}
	
}
