package com.iansky.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iansky.spring.dao.ContactDAO;
import com.iansky.spring.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactDAO contactDAO;

	@Override
	@Transactional
	public List<Contact> getContacts() {
		return contactDAO.getContacts();
	}

}
