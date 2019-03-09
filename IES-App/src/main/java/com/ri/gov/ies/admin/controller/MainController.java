package com.ri.gov.ies.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ri.gov.ies.constant.AppConstant;
import com.ri.gov.ies.properties.ApplicationProperties;

@RestController
public class MainController {
	
	@Autowired
	private ApplicationProperties prop;
	
	@RequestMapping(value="/welcome")
	public String getMessage() {
		String msg=prop.getApplication().get(AppConstant.MESSAGE);
		System.out.println(msg);
		return "<h1 style='color:green;text-align:center'>"+msg+"</h1>";
	}
}
