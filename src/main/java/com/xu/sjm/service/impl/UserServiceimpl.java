package com.xu.sjm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xu.sjm.dao.UserMapper;
import com.xu.sjm.model.User;
import com.xu.sjm.service.UserService;

@Service
public class UserServiceimpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	public User getUserById(int id) {
		
		return userMapper.selectByPrimaryKey(id);
		
	}
	
	public int insertUser(User u) {
//		int ret = userMapper.insertSelective(u);
		int ret = userMapper.insert(u);
		return ret;
	}
	
	
	
	

}
