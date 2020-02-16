package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Site;
import com.accp.mapper.SiteMapper;

@Service
@Transactional
public class SiteService {
	@Autowired
	SiteMapper siteMapper;
	
	public List<Site> sitsel(){
		return siteMapper.selectByExample(null);
	}
}
