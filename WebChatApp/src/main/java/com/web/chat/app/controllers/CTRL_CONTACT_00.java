package com.web.chat.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CTRL_CONTACT_00 {
	
	@GetMapping("/contact")
	public String event_00_00() {
		return "contact";
	}
}
