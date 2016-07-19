package com.xu.sjm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xu.sjm.dao.UserMapper;
import com.xu.sjm.model.User;
import com.xu.sjm.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	public User getUserById(int id) {
		
		return userMapper.selectByPrimaryKey(id);
		
	}
	
	public int insertUser(User u) throws Exception{
//		int ret = userMapper.insertSelective(u);
		int ret = userMapper.insert(u);
		
		return ret;
	}
	
	
	
	

}
