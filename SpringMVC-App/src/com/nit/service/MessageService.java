package com.nit.service;

import org.springframework.stereotype.Service;

@Service("msgService")
public class MessageService {

	public MessageService() {
		System.out.println("MessageService::Constructor");
	}

	public String getMsg() {
		return "Welcome to SpringMVC..!!";
	}

	public String getGreetMsg() {
		return "Hello, I am from Asynchronus request";
	}

}
