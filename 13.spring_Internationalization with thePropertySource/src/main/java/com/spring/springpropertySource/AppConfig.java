package com.spring.springpropertySource;

 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "classpath:message.properties")
@Import({ CustomerConfig.class, SChedulerConfig.class })
public class AppConfig {

	@Autowired
	Environment env;
	
	
	@Bean
	@Lazy
		
	public MessageBeajn messageBean() {
		
		return new MessageBeajn(env.getProperty("message"));
	}
	
	
}
