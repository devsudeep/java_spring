package com.spring.springpropertySource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

public class AppProperty {
	private String applicationHome;
	private String userHome;

	public String getApplicationHome() {
		return applicationHome;
	}

	public void setApplicationHome(String applicationHome) {
		this.applicationHome = applicationHome;
	}

	public String getUserHome() {
		return userHome;
	}

	public void setUserHome(String userHome) {
		this.userHome = userHome;
	}
}