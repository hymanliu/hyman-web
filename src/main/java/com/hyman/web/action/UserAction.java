package com.hyman.web.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hyman.web.bean.User;
import com.hyman.web.service.UserService;


@Controller
@RequestMapping("/user")
public class UserAction {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/api/list")
	public @ResponseBody List<User> list(){
		return userService.list();
	}
	
}
