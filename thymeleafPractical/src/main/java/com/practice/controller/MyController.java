package com.practice.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
}
