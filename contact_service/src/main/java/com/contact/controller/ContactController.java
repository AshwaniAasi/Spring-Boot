package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entity.Contact;
import com.contact.service.ContactSerivce;

@RestController
@RequestMapping("/contact")
public class ContactController 
{
	@Autowired
	private ContactSerivce  contactService;
	
	@RequestMapping("/user/{userId}")
	List<Contact> getContact( @PathVariable("userId") Integer userId)
	{
		return this.contactService.getContactOfUser(userId);
	}
}
