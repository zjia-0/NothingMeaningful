package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Original;
import com.accp.mapper.OriginalMapper;

@Service
@Transactional
public class OriginalService {
	@Autowired
	OriginalMapper originalMapper;
	
	public List<Original> origsel(){
		return originalMapper.selectByExample(null);
	}
}
