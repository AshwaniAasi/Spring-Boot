package com.devtool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test()
	{
		int a=55;
		int b=89;
		return "this is just testing/t sum of a and b is : " + (a+b);
	}

}
