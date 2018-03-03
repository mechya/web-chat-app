package com.web.chat.app.messaging.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.web.chat.app.messaging.forms.Greeting;
import com.web.chat.app.messaging.forms.Message;

@Controller
public class CTRL_MSG_00 {

	@MessageMapping("/chat")
	@SendTo("/topic/messages")
	public Greeting  greeting(Message message) {
		 String time = new SimpleDateFormat("HH:mm").format(new Date());
		 return new Greeting(message.getFrom(), message.getText(), time);
	}
}
