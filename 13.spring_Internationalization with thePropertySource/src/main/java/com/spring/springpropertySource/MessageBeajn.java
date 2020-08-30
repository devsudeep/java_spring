package com.spring.springpropertySource;

import org.springframework.stereotype.Service;

@Service("test")
public class MessageBeajn {
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MessageBeajn(String message) {
		super();
		this.message = message;
	}
	
}
