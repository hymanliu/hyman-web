package com.hyman.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hyman.web.bean.User;
import com.hyman.web.service.UserService;

public class UserServiceTest extends BaseJunit {

	@Autowired UserService userService;
	
	@Test
	public void testGet(){
		List<User> list = userService.list();
		
		for(User u:list)
			System.out.println(u.getUserName());
	}
}
