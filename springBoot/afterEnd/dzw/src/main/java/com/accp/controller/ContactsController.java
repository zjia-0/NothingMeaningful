package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Contacts;
import com.accp.service.ContactsService;

@RestController
public class ContactsController {
	@Autowired
	ContactsService contactsService;
	
	@PostMapping("/contactssel")
	public List<Contacts> contactssel(){
		return contactsService.contactssel();
	}
	
	@PostMapping("/contactsselect")
	public Contacts contactsselect(int id) {
		return contactsService.contactsselect(id);
	}
	
	@PostMapping("/contactsinsert")
	public int contactsinsert(Contacts contacts) {
		return contactsService.contactsinsert(contacts);
	}
	
	@PostMapping("/contactsdelete")
	public int contactsdelete(int id) {
		return contactsService.contactsdelete(id);
	}
	
}
