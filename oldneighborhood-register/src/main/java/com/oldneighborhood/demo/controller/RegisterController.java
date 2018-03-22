package com.oldneighborhood.demo.controller;

import java.sql.Timestamp;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oldneighborhood.demo.dao.UserDao;
import com.oldneighborhood.demo.entity.User;
import com.oldneighborhood.demo.service.RegisterService;

/**
 * 
* @ClassName: RegisterController  
* @Description: 注册模块
* @author user005  
* @date 2018年3月22日  
*
 */
@RestController
//@RequestMapping("/login")
public class RegisterController {
	
	@Autowired
	private RegisterService registerService;
	@Resource
	UserDao userdao;
	//http://localhost:8081/oldneighborhood/register
	@RequestMapping("/register")
	public boolean register(User user) {
		Date date = new Date();
//		registerService.signup(user);
		userdao.userSignup("2011111111", "bryan", "bryan", "templatet/", 0, "12323232323", "Ren@iusd.com", date, "nothing");
		return true;
	}

}
