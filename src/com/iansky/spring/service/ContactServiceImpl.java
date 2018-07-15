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

	@Override
	@Transactional
	public void addContact(Contact contact) {
		contactDAO.addContact(contact);
	}

	@Override
	@Transactional
	public Contact getContact(int contactId) {
		return contactDAO.getContact(contactId);
	}

	@Override
	@Transactional
	public void deleteContact(int contactId) {
		contactDAO.deleteContact(contactId);
	}

}
