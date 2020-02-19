package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.accp.domain.Project;
import com.accp.domain.projectwang;
import com.accp.mapper.ProjectMapper;

@Service
@Transactional
public class ProjectService {
	@Autowired
	ProjectMapper ProjectMapper;
	
	public List<projectwang> projectselect(String pname,String typename){
		
		if (typename=="" || typename==null && pname==""||pname==null) {
			return ProjectMapper.proselsel();
		}
		else if (pname.equals(null)|| pname.equals("")&& typename!="" || typename!=null ) {
			return ProjectMapper.proselname(typename);
		}else if (typename=="" || typename==null&&pname!=""||pname!=null ) {
			return ProjectMapper.prosel(pname);
		}
			
		return ProjectMapper.proselsel();
	}
	
	public int  projectdelete(int id) {
		return ProjectMapper.deleteByPrimaryKey(id);
	}
	
	public int projectinsert(Project project) {
		return ProjectMapper.insert(project);
	}
	
	public int projectupdate(Project project) {
		return ProjectMapper.updateByPrimaryKey(project);
	}
	
	public Project projectupse(int id) {
		return ProjectMapper.selectByPrimaryKey(id);
	}
	
}
