package com.xu.sjm.service;

import com.xu.sjm.model.User;

public interface UserService {

	User getUserById(int id);

	int insertUser(User u);

}
