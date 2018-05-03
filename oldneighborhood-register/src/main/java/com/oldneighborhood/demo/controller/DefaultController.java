package com.oldneighborhood.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName: DefaultController
 * @Description: 默认加载页面
 * @author user005
 * @date 2018年3月26日
 * @url:	"http://localhost:8081/oldneighborhood/register"
 * @return:	page
 */
@Controller
public class DefaultController {
	

	@RequestMapping(path= {"/info"}, method= {RequestMethod.GET})
	public String register() {
		return "info";
	}

}
