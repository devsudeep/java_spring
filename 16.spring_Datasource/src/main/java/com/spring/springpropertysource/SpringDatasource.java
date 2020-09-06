package com.spring.springpropertysource;

import java.io.IOException;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringDatasource {
	final static Logger logger = (Logger) LoggerFactory.getLogger(SpringDatasource.class);

	@Autowired
	Environment env;

	public static void main(String... args) throws IOException {
        SpringApplication.run(SpringDatasource.class, args);		  
 // 		context.refresh();
		
 
	}

}
