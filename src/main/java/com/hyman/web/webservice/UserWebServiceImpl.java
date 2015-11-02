package com.hyman.web.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hyman.web.bean.User;
import com.hyman.web.service.UserService;

@Component
public class UserWebServiceImpl implements UserWebService {

	@Autowired
	UserService userService;
	
	public User find(String username) {
		
		//User user = userService.find(username);
		
		User user = new User();
		user.setUserName("hyman");
		return user;
	}

}
