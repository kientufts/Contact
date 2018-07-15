package com.iansky.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contact")
public class ContactController {
	
	@RequestMapping("/list")
	public String listContacts(Model model) {
		return "list-contacts";
	}

}
