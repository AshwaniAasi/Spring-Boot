package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceIMPL implements ContactSerivce
{
	//fake list of contact
	List<Contact> list=List.of(
			new Contact(1,"sonuc1994@gmail.com", "ashwani", 1311),
			new Contact(2,"anuradha1994@gmail.com", "anuradha", 1311),
			new Contact(3,"anushwi2023@gmail.com", "anushwi", 1312),
			new Contact(4,"sonuc1996@gmail.com", "kumar", 1313)
			);
	@Override
	public List<Contact> getContactOfUser(Integer userId) 
	{
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}
	
}
