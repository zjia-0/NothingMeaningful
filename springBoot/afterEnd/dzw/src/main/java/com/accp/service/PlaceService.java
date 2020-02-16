package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Place;
import com.accp.mapper.PlaceMapper;

@Service
@Transactional
public class PlaceService {
	@Autowired
	PlaceMapper placeMapper;
	
	public List<Place> plsel(){
		return placeMapper.selectByExample(null);
	}
}
