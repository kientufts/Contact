package com.iansky.spring.service;

import java.util.List;

import com.iansky.spring.entity.Contact;

public interface ContactService {

	public List<Contact> getContacts();

	public void addContact(Contact contact);

	public Contact getContact(int contactId);

	public void deleteContact(int contactId);
}
