package com.pk.service;

import org.springframework.stereotype.Service;

@Service("msgService")
public class MsgService {
	public MsgService() {
		System.out.println("MsgService.MsgService()");
	}
	public String wishMsh() {
		return "Welcome to Spring MVC....";
	}
	public String getGreetMsg() {
		return "Hello, I am from Asynchronus request";
	}
}
