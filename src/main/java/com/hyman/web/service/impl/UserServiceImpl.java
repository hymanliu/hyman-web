package com.hyman.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public void save(User user) {
		userDao.save(user);	
	}

	@Override
	public List<User> list() {
		return userDao.findAll();
	}

	@Override
	public User find(String username) {
		return userDao.find(username);
	}
	
	
}
