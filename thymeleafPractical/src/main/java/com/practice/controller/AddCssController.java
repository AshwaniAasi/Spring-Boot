package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddCssController 
{	
	@RequestMapping("/example")
	public String example()
	{
		return "example";
	}

}
