package com.xu.sjm.service;

import com.xu.sjm.model.UserInfo;

public interface UserInfoService {
	
	
	UserInfo getUserInfo(int uid);
	
	int insert(UserInfo userInfo);
	
	
	

}
