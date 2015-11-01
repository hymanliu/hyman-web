package com.hyman.web.action;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import com.hyman.web.bean.User;
import com.hyman.web.service.UserService;

@Controller
public class LoginAction {
	
	@Autowired
	private UserService userService;
	
	@Autowired HttpSession session;  

	@RequestMapping("/login")
	public String logoin(){
		return "login";
	}
	
	@RequestMapping("/signIn")
	public String signIn(WebRequest request,String username,String password){
		User user = userService.find(username);
		if(user!=null && user.getPassword().equals(password)){
			session.setAttribute("user", user);
			return "redirect:/index";
		}
		return "redirect:/login";
	}
	
	@RequestMapping("/signUp")
	public String signUp(){
		return "signUp";
	
	}
	
	@RequestMapping(value="/regist",method=RequestMethod.POST)
	public String regist(WebRequest request, Model model,User user){
		
		if(StringUtils.isEmpty(user.getUserName()) || StringUtils.isEmpty(user.getPassword())){
			model.addAttribute("errorMessage", "用户名、密码不能为空！");
			return "signUp";
		} 	
		
		User u = userService.find(user.getUserName());
		
		if(u!=null){
			model.addAttribute("errorMessage", "用户已存在！");
			return "signUp";
		}
		
		userService.save(user);
		
		session.setAttribute("user", user);
		
		return "redirect:/index";
	}
	
	@RequestMapping(value={"","/","/index"})
	public String home(){
		
		User user = (User) session.getAttribute("user");
		if(user==null) return "redirect:/login";
		
		System.out.println(user.getUserName()+"\t"+user.getRealName());
		
		return "index";
	}
}
