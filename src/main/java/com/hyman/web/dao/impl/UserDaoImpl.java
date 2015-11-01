package com.hyman.web.dao.impl;

import org.springframework.stereotype.Repository;

import com.hyman.web.bean.User;
import com.hyman.web.dao.UserDao;


@Repository
public class UserDaoImpl extends BaseDaoImpl<User, Integer> implements UserDao {

	@Override
	public User find(String username){
		User ret = (User) getSession().createQuery("from User u where u.userName=:username").setString("username", username).uniqueResult();
		return ret;
	}
}
