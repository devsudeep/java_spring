package com.spring.springpropertySource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SChedulerConfig {
	
	@Bean(name="scheduler")
	public SchedulerBo schebo() {
		return new SchedulerBo();

	}
}
