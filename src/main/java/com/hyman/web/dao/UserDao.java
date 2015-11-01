package com.hyman.web.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAO;
import com.hyman.web.bean.User;

public interface UserDao extends GenericDAO<User, Integer>{
	
	public User find(String username);
}
