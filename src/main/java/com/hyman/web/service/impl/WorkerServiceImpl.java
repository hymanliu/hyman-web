package com.hyman.web.service.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hyman.web.bean.Worker;
import com.hyman.web.dao.WorkerDao;
import com.hyman.web.service.WorkerService;


@Service("workerService")
@Transactional
public class WorkerServiceImpl implements WorkerService {
	@Autowired
	private WorkerDao workerDao;
	
	@Override
	public void save(Worker woker){
		workerDao.save(woker);
	}
	
	@Override
	public Worker find(Integer id){
		return workerDao.find(id);
	}
	
	@Override
	public void delete(Integer id){
		workerDao.removeById(id);
	}
	
	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<Worker> list(){
		return workerDao.findAll();
	}
	
}
