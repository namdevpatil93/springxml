package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.service.TestService;

@Controller
public class TestController 
{
	
	@Autowired
	private TestService testService;
	
	@RequestMapping(value="/")
	public ModelAndView slashd()
	{
		System.out.println("in /");
		String msg=testService.getMessage();
		
		System.out.println(msg);
		return new ModelAndView("index");
	}
}
