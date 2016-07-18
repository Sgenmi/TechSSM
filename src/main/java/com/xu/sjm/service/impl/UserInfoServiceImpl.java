package com.xu.sjm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xu.sjm.dao.UserInfoMapper;
import com.xu.sjm.model.UserInfo;
import com.xu.sjm.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoMapper userInfoMapper;
	
	
	public UserInfo getUserInfo(int uid) {
		
		return userInfoMapper.selectByUid(uid);
		
	}

	public int insert(UserInfo userInfo) {
		return userInfoMapper.insertSelective(userInfo);
	}

}
