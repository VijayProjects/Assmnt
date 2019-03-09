package com.pk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pk.model.User;
import com.pk.service.MsgService;

@Controller("msgController")
public class MController {
	
	public MController() {
		System.out.println("MController.MController()");
	}
	
	@Autowired
	private MsgService service;
	
	@RequestMapping("/wish")
	public String wishMsg(Model model) {
		String wishMsg=service.wishMsh();
		model.addAttribute("msg", wishMsg);
		return "wish";
	}
	
	@RequestMapping(value = "/wish/greet")
	public @ResponseBody String greetMsg() {
		// calling service layer
		String greetMsg = service.getGreetMsg();
		System.out.println("green()");
		//returning response
		return greetMsg;
	}
	
	@RequestMapping(value = "/userForm")
	public String userForm(Model model) {
		User user=new User();
		model.addAttribute("model", user);
		return "userForm";
	}
	
	@RequestMapping(value="/userForm/personalInfo")
	public @ResponseBody String savePersonalInfo(@ModelAttribute(value="model") User user) {
		System.out.println(user);
		return "Form Submitted Successfully....";
	}

}
