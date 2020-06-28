package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.user.service.Userservice;

@Controller
public class testcontroller {
	
	@Autowired
	Userservice userservice;
	
	
	@RequestMapping("hello.do")
	public String test(Model model) {
		
		
		model.addAttribute("userlist",userservice.getall());
		
		return "index";
	}
}
