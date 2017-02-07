package com.hyman.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hyman.web.bean.Job;
import com.hyman.web.bean.key.Jobkey;
import com.hyman.web.service.JobService;

public class JobServiceTest extends BaseJunit {

	@Autowired JobService jobService;
	
	@Test
	public void testSave(){
		
		Job o = new Job();
		
		Jobkey key = new Jobkey("002","2016-01-01 00:00:00");
		o.setKey(key);
		o.setName("job2");
		jobService.save(o);
	}
}
