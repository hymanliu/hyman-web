package com.hyman.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hyman.web.bean.User;
import com.hyman.web.dao.UserDao;
import com.hyman.web.service.UserService;


@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	@Caching(put={@CachePut(value="wsCache",key="#user.userName + 'userService.find'")
	,@CachePut(value="wsCache",key="#user.id + 'userService.findById'")})
	public void save(User user) {
		userDao.save(user);	
	}

	@Override
	@Cacheable(value = "wsCache")
	public List<User> list() {
		return userDao.findAll();
	}

	@Override
	@Cacheable(value = "wsCache",key="#username + 'userService.find'")
	public User find(String username) {
		return userDao.find(username);
	}
	
	@Override
	@Caching(put={@CachePut(value="wsCache",key="#user.userName + 'userService.find'")
	,@CachePut(value="wsCache",key="#user.id + 'userService.findById'")})
	public User update(User user){
		 userDao.save(user);
		 return user;
	}

	@Override
	@Cacheable(value = "wsCache",key="#id + 'userService.findById'")
	public User findById(Integer id) {
		return userDao.find(id);
	}
	
	
	
}
