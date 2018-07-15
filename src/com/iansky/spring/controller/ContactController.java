package com.iansky.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iansky.spring.dao.ContactDAO;
import com.iansky.spring.entity.Contact;

@Controller
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	private ContactDAO contactDao;
	
	@RequestMapping("/list")
	public String listContacts(Model model) {
		
		List<Contact> contacts = contactDao.getContacts();
		model.addAttribute("contacts", contacts);
		return "list-contacts";
	}

}
