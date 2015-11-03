package com.hyman.web.webservice.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hyman.web.bean.User;
import com.hyman.web.service.UserService;
import com.hyman.web.webservice.UserWebService;

@Component
public class UserWebServiceImpl implements UserWebService {
	@Autowired
	UserService userService;
	
	public User find(String username) {
		User user = userService.find(username);
		return user;
	}

	public List<User> list() {
		return userService.list();
	}

	public boolean update(String username,String password) {
		User user = userService.find(username);
		if(user!=null)
		{
			user.setPassword(password);
			userService.update(user);
			return true;
		}
		return false;
	}

	public User findById(int id) {
		return userService.findById(id);
	}

}
