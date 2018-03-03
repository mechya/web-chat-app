package com.web.chat.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CTRL_HOME_00 {

	@GetMapping("/")
	public String event_00_00() {
		return "home";
	}


}
