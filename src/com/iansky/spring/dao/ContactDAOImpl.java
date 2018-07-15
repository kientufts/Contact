package com.iansky.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iansky.spring.entity.Contact;

@Repository
public class ContactDAOImpl implements ContactDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Contact> getContacts() {
		Session session = sessionFactory.getCurrentSession();
		Query<Contact> query = session.createQuery("from Contact order by lastName", Contact.class);
		List<Contact> contacts = query.getResultList();
		return contacts;
	}

	@Override
	public void addContact(Contact contact) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(contact);
	}

	@Override
	public Contact getContact(int contactId) {
		Session session = sessionFactory.getCurrentSession();
		Contact contact = session.get(Contact.class, contactId);
		return contact;
	}

	@Override
	public void deleteContact(int contactId) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete from Contact where id=:contactId");
		query.setParameter("contactId", contactId);
		query.executeUpdate();
	}

	@Override
	public List<Contact> searchContacts(String searchName) {
		Session session = sessionFactory.getCurrentSession();
		Query query;
		// only search by name if searchName is not empty
		if (searchName != null && searchName.trim().length() > 0) {
			// search for firstName or lastName ... case insensitive
			query = session.createQuery("from Contact where lower(firstName) like:name or lower(lastName) like:name",
					Contact.class);
			query.setParameter("name", "%"+searchName.toLowerCase()+"%");
		} else {
			// get all contacts when searchName is null
			query = session.createQuery("from Contact", Contact.class);
		}
		List<Contact> contacts = query.getResultList();
		return contacts;
	}

}
