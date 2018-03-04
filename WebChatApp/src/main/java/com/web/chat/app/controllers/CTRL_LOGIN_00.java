package com.web.chat.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CTRL_LOGIN_00 {
	
	@GetMapping("/login")
	public String event_00_00() {
		return "login";
	}
}
