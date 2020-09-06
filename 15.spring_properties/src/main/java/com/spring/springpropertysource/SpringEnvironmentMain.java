package com.spring.springpropertysource;

import java.io.IOException;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
@EnableConfigurationProperties(Config.class)
//@ConfigurationPropertiesScan
public class SpringEnvironmentMain  {
	final static Logger logger = (Logger) LoggerFactory.getLogger(SpringEnvironmentMain.class);

 

	@Autowired
	Environment env;

	public static void main(String... args) throws IOException {
 		  SpringApplication app = new SpringApplication(SpringEnvironmentMain.class);
		  app.setAdditionalProfiles("default");
        ConfigurableApplicationContext context = app.run(); 		
// 		context.refresh();
		System.out.println(System.getenv());
		System.out.println(System.getenv("PATH")); 
		Customers cust = (Customers) context.getBean("customers");
		System.out.println(cust.getName());
		
		Config cnf = (Config) context.getBean("config");
		System.out.println(cnf.getServers());

	}
	
}
