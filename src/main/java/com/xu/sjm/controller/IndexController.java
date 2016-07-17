package com.xu.sjm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xu.sjm.model.User;
import com.xu.sjm.service.UserService;

@Controller
@RequestMapping(value="/mvc")
public class IndexController {

	@Autowired
	private UserService userService;
	
	
	
	
	@RequestMapping(value="/hello")
	public String hello() {
		
		User user = new User();
		
		short  a = 10;
		
		user.setUsername("sjm");
		user.setPassword("123456789");
		user.setAge(a);
		
		userService.getUserById(1);
		int b = userService.insertUser(user);
		
		System.out.println(b);
		
		System.out.println("fffffffffffff");
		return "hello";
	}
	
	
	
	
}
