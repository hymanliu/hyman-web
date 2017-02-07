package com.hyman.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hyman.web.bean.User;
import com.hyman.web.service.UserService;

@Controller
public class LoginAction {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	public String home(){
		List<User> list = userService.list();
		return "login";
	}
	
	
	@RequestMapping("/users")
	public @ResponseBody List<User> users(){
		
		return userService.list();
	}
}
