package com.iansky.spring.dao;

import java.util.List;

import com.iansky.spring.entity.Contact;

public interface ContactDAO {

	public List<Contact> getContacts();

	public void addContact(Contact contact);
}
