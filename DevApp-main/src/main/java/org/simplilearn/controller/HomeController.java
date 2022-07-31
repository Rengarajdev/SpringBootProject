package org.simplilearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
	
	@RequestMapping("/getname")
	public String getName()
	{
		return "Welcome to AWS";
	}
}