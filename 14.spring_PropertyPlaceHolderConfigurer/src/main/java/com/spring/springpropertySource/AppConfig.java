package com.spring.springpropertySource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "classpath:application.properties")
public class AppConfig {
	@Value("${application_home}")
	private String restAPIUrl;

	@Value("${userHome}")
	private String userHome;

	@Autowired
	Environment env;

	@Bean
	public AppProperty appProperty() {

		AppProperty appProperty = new AppProperty();
		appProperty.setApplicationHome(restAPIUrl);
		appProperty.setUserHome(userHome);
		System.out.println(env);
		System.out.println(env.getProperty("application_home"));

		System.out.println();
		return appProperty;
	}

}