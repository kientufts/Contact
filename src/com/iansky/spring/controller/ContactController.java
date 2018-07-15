package com.iansky.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	@PostMapping("/addContact")
	public String addContact(@ModelAttribute("contact") Contact contact) {
		contactService.addContact(contact);
		return "redirect:/contact/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("contactId") int contactId, Model model) {
		Contact contact = contactService.getContact(contactId);
		model.addAttribute("contact", contact);
		return "contact-form";
	}

}
