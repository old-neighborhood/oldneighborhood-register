package com.oldneighborhood.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DefaultController {
	

	@RequestMapping(path= {"/register"}, method= {RequestMethod.GET})
	public String register() {
		return "/register";
	}

}
