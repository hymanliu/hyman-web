package com.hyman.web.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hyman.web.bean.Job;
import com.hyman.web.dao.JobDao;
import com.hyman.web.service.JobService;

@Service
@Transactional
public class JobServiceImpl implements JobService {
	
	@Autowired
	private JobDao jobDao;

	@Override
	public void save(Job o) {
		jobDao.save(o);	
	}

}
