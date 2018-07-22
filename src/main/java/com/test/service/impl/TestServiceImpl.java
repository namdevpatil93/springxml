package com.test.service.impl;

import org.springframework.stereotype.Service;

import com.test.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "hello1";
	}

}
