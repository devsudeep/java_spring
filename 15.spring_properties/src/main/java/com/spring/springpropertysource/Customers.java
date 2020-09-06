package com.spring.springpropertysource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Customers {

	@Value("${name}")
	String name;
	
	public String getName() {
		return name;
	}
	
	
}
