package com.practice.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController 
{
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Model model)
	{
		//putting data in model
		model.addAttribute("name", "ashwani Kumar");
		model.addAttribute("currentData", new Date().toString());
		System.out.println("Inside about handler");
		return "about"; //about.html
	}
	
	//handling iteration
	@GetMapping("/example-loop")
	public String iterateHandler(Model m)
	{
		//creating a list
		List<String> name = List.of("Ankit", "Laxmi" , "Karan", "John");
		m.addAttribute("name", name);
		return "iterate";
	}
	
	//handler for conditional statement
	@GetMapping("/condition")
	public String conditionHandler(Model m)
	{
		System.out.println("Conditional handler executed");
	
		m.addAttribute("gender", "F");
		
		List<Integer> list = List.of(25,45,15,145,45,73);
		m.addAttribute("list", list);
		
		return "condition";
	}
	
	//handler for including fragment
	@GetMapping("/service")
	public String serviceHandler(Model m)
	{
		m.addAttribute("title", "My Country India");
		m.addAttribute("substitle", LocalDateTime.now().toString());
		return "service";
	}
	
	@GetMapping("/newabout")
	public String newAbout()
	{
		return "aboutnew";
	}
	
	@GetMapping("/newcontact")
	public String newcontact()
	{
		return "newcontact";
	}
}
