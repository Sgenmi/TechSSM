package com.xu.sjm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xu.sjm.model.User;
import com.xu.sjm.model.UserInfo;
import com.xu.sjm.service.UserInfoService;
import com.xu.sjm.service.UserService;

@Controller
@RequestMapping(value = "/mvc")
public class IndexController {

	@Autowired
	private UserService userService;

	@Autowired
	private UserInfoService userInfoService;

	@RequestMapping(value = "/hello")

	public String hello() {

		try {
			User user = new User();
			UserInfo userInfo = new UserInfo();
			short a = 10;
			user.setUsername("sjm");
			user.setPassword("1234567");
			user.setAge(a);
			
			userService.insertUser(user);
			
			userInfo.setUid(user.getId());
			userInfo.setMobile("13989484889");
			userInfo.setQq("150560156");
			userInfoService.insert(userInfo);

			int j = 1 / 0;
			throw new RuntimeException("eeeee");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return "hello";
	}

}
