package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nit.service.MessageService;

@Controller
public class MessageController {

	public MessageController() {
		System.out.println("MessageController::Constructor");
	}

	@Autowired(required = true)
	private MessageService msgService;

	@RequestMapping(value = "/wish")
	public String wishMsg(Model model) {
		// calling service layer
		String wishMsg = msgService.getMsg();

		// set the data in model scope
		model.addAttribute("msg", wishMsg);

		// returning logical view name
		return "wish";
	}

	@RequestMapping(value = "/wish/greet")
	public @ResponseBody String greetMsg(Model model) {
		// calling service layer
		String greetMsg = msgService.getGreetMsg();
		
		//returning response
		return greetMsg;
	}

}
