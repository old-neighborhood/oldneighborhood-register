package com.oldneighborhood.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oldneighborhood.demo.entity.Saler;
import com.oldneighborhood.demo.entity.User;
import com.oldneighborhood.demo.service.SalerService;
import com.oldneighborhood.demo.service.UserService;

/**
 * 
 * @ClassName: RegisterController
 * @Description: 注册模块
 * @author user005
 * @date 2018年3月22日
 *
 */
@RestController
@RequestMapping(path = { "/register" }, method = { RequestMethod.GET })
public class RegisterController {

	@Autowired
	private UserService userService;

	// http://localhost:8081/oldneighborhood/register/signup
	@RequestMapping(path = { "/usersignup" }, method = { RequestMethod.GET })
	public String userSingUp(Saler user) {
		boolean flag = false;
		User auser = new User("bryana", "123456", "13425252525");
		flag = userService.userSignup(auser);
		return flag ? "success" : "fail";
	}

	@Autowired
	private SalerService salerService;

	@RequestMapping(path = { "/salersignup" }, method = { RequestMethod.GET })
	public String salerSignup(Saler saler) {
		Saler asaler = new Saler("bryana", "123456", "13425252525");
		boolean flag = false;
		flag = salerService.salerSignup(asaler);
		return flag ? "success" : "fail";
	}

}
