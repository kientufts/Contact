package com.iansky.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iansky.spring.entity.Contact;
import com.iansky.spring.service.ContactService;

@Controller
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/list")
	public String listContacts(Model model) {
		
		List<Contact> contacts = contactService.getContacts();
		model.addAttribute("contacts", contacts);
		return "list-contacts";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		Contact contact = new Contact();
		model.addAttribute("contact", contact);
		return "contact-form";
	}

}
