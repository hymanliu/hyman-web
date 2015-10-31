package com.hyman.web.action;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hyman.web.service.WorkerService;



//@Controller
public class WorkerAction {
	@Autowired
	private WorkerService workerService;
	
	public String execute(){
		//ActionContext.getContext().put("workers", workerService.list()); 
		return "success";
	}
	public String add(){
		return "add";
	}
}
