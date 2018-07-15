package com.iansky.spring.dao;

import java.util.List;

import com.iansky.spring.entity.Contact;

public interface ContactDAO {

	public List<Contact> getContacts();

	public void addContact(Contact contact);

	public Contact getContact(int contactId);

	public void deleteContact(int contactId);

	public List<Contact> searchContacts(String searchName);
}
