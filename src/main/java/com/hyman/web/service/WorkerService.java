package com.hyman.web.service;

import java.util.List;

import com.hyman.web.bean.Worker;


public interface WorkerService {

	public abstract void save(Worker employee);

	public abstract Worker find(Integer id);

	public abstract void delete(Integer id);

	public abstract List<Worker> list();

}