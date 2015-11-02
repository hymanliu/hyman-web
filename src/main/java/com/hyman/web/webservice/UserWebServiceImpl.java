package com.hyman.web.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.hyman.web.bean.User;
import com.hyman.web.service.UserService;

@Component
public class UserWebServiceImpl implements UserWebService {
	@Autowired
	UserService userService;
	
	@Cacheable(value = "wsCache")
	public User find(String username) {
		
		User user = userService.find(username);
		return user;
	}

	@Cacheable(value = "wsCache")
	public List<User> list() {
		return userService.list();
	}

}
