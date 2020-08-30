package com.spring.springpropertySource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {

	@Bean(name="customer")
	public CustomerBo customerBO() {
		return new CustomerBo();

	}
}
