package com.hyman.web.webservice.impl;

import org.springframework.stereotype.Component;

import com.hyman.web.webservice.TestWebService;

@Component
public class TestWebServiceImpl implements TestWebService {

	@Override
	public String test(String arg) {
		return "hello world";
	}


}
