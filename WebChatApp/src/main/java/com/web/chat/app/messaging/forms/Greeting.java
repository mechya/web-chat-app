package com.web.chat.app.messaging.forms;

import lombok.Getter;
import lombok.Setter;

public class Greeting {
	@Getter@Setter
	private String from;
	@Getter@Setter
	private String text;
	@Getter@Setter
	private String time;

	public Greeting(final String from, final String text, final String time) {
		this.from = from;
		this.text = text;
		this.time = time;
	}
}
