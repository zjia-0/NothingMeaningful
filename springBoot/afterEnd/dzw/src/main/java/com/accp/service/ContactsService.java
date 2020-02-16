package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Contacts;
import com.accp.mapper.ContactsMapper;

@Service
@Transactional
public class ContactsService {
	@Autowired
	ContactsMapper contactsMapper;
	
	public List<Contacts> contactssel(){
		return contactsMapper.selectByExample(null);
	}
	
	public Contacts contactsselect(int id) {
		return contactsMapper.selectByPrimaryKey(id);
	}
	
	public int contactsinsert(Contacts contacts) {
		return contactsMapper.insert(contacts);
	}
	
	public int contactsdelete(int id) {
		return contactsMapper.deleteByPrimaryKey(id);
	}
	
	
	
}
