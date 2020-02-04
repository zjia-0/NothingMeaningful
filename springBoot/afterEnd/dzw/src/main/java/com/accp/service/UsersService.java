package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Users;
import com.accp.domain.UsersExample;
import com.accp.mapper.UsersMapper;

@Service
@Transactional
public class UsersService {

	@Autowired
	UsersMapper usersMapper;

	public List<Users> find() {
		return usersMapper.selectByExample();
	}

}
