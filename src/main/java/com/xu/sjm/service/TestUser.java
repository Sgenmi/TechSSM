package com.xu.sjm.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.druid.support.json.JSONParser;
import com.alibaba.fastjson.JSON;
import com.xu.sjm.model.User;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring.xml","classpath:spring/spring-mybatis.xml","classpath:spring/spring-mvc.xml"}) 
public class TestUser {

	@Autowired
	private UserService userService;
	 
	@Test
	public void insert() throws Exception {
		
		short a = 5;
		User user = new User();
		
		user.setUsername("sjm");
		user.setPassword("5555");
		user.setAge(a);
		
		
		int b = userService.insertUser(user);
		
		System.out.println(user.getId());
//		
		
		System.out.println("5555");
		
		
	}
	@Test
	public void getUser()
	{
		User user = new User();
		
		user = userService.getUserById(2);
		
		System.out.println(JSON.toJSONString(user));
		
		
	}
	

}