package com.hyman.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hyman.web.bean.TestA;
import com.hyman.web.bean.TestB;
import com.hyman.web.bean.TestC;
import com.hyman.web.service.TestAService;

public class TestAServiceTest extends BaseJunit {

	@Autowired TestAService testAService;
	
	@Test
	public void testSaveAB(){
		
		TestA o = new TestA();
		
		o.setName("lisi");
		TestB b = new TestB();
		b.setRemarks("aaa");
		o.setTestB(b);
		b.setTestA(o);
		
		testAService.save(o);
	}
	
	
	@Test
	public void testSaveAC(){
		
		TestA a = new TestA();
		
		a.setName("wangwu");
		TestC c = new TestC();
		c.setAddress("shenzhen nanshan");
		
		c.setTestA(a);
		a.setTestC(c);
		
		testAService.save(a);
	}
	
	@Test
	public void testGet(){
		TestA a = testAService.get(4);
		
		System.out.println(a.getTestB().getRemarks());
	}
}
