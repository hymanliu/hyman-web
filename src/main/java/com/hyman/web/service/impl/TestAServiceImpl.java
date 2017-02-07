package com.hyman.web.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hyman.web.bean.TestA;
import com.hyman.web.dao.TestADao;
import com.hyman.web.service.TestAService;

@Service
@Transactional
public class TestAServiceImpl implements TestAService {
	
	@Autowired
	private TestADao testADao;

	@Override
	public void save(TestA o) {
		testADao.save(o);	
	}

	@Override
	public TestA get(int id) {
		return testADao.find(id);
	}

}
