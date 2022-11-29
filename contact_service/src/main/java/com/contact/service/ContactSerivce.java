package com.contact.service;

import java.util.List;

import com.contact.entity.Contact;

public interface ContactSerivce 
{
	public List<Contact> getContactOfUser(Integer userId);
}
