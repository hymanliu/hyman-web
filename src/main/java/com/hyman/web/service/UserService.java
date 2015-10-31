package com.hyman.web.service;

import java.util.List;

import com.hyman.web.bean.User;


public interface UserService {

	void save(User user);

	List<User> list();
	
}
