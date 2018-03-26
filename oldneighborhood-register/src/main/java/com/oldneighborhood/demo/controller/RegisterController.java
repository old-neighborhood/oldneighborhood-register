package com.oldneighborhood.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
 * @url:	"http://localhost:8081/oldneighborhood/register/usersignup
 * @return:	"result":"success"/"result":"fail"
 * @url:	"http://localhost:8081/oldneighborhood/register/salersignup
 * @return:	"result":"success"/"result":"fail"
 */
@RestController
@RequestMapping(path = { "/register" }, method = { RequestMethod.GET })
public class RegisterController {

	@Autowired
	private UserService userService;

	// http://localhost:8081/oldneighborhood/register/usersignup
	@RequestMapping(path = { "/usersignup" }, method = { RequestMethod.GET })
	public String userSingUp(@RequestBody Map<String, Object> reqMap) {
		boolean flag = false;
		User user = new User(
				reqMap.get("username").toString(),
				reqMap.get("password").toString(),
				reqMap.get("tele").toString());
//		User testuser = new User("bryanJ", "qwertyu", "13612341234");
		flag = userService.userSignup(user);
		return flag ? "\"result\":\"success\"" : "\"result\":\"fail\"";
	}

	@Autowired
	private SalerService salerService;
	// http://localhost:8081/oldneighborhood/register/salersignup
	@RequestMapping(path = { "/salersignup" }, method = { RequestMethod.GET })
	public String salerSignup(@RequestBody Map<String, Object> reqMap) {
		Saler saler = new Saler(
				reqMap.get("username").toString(),
				reqMap.get("password").toString(),
				reqMap.get("tele").toString());
//		Saler testsaler = new Saler("bryanJ", "qwertyu", "13612341234");
		boolean flag = false;
		flag = salerService.salerSignup(saler);
		return flag ? "\"result\":\"success\"" : "\"result\":\"fail\"";
	}

}
