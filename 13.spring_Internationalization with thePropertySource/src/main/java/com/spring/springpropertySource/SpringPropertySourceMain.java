package com.spring.springpropertySource;

import java.io.File;
import java.io.IOException;

import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
import ch.qos.logback.classic.Logger;

//@SpringBootApplication
//@EnableCaching
public class SpringPropertySourceMain extends SpringBootServletInitializer {
	final static Logger logger = (Logger) LoggerFactory.getLogger(SpringPropertySourceMain.class);

//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(SpringLifeCycles.class);
//	}
	public static void main(String... args) throws IOException {
		
		ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
		
		MessageBeajn msg = context.getBean("messageBean", MessageBeajn.class);
		
		System.out.println(msg.getMessage());
		
		CustomerBo customer = (CustomerBo) context.getBean("customer");
		customer.printMsg("Hello 1");

		SchedulerBo scheduler = (SchedulerBo) context.getBean("scheduler");
		scheduler.printMsg("Hello 2");//		context.close();
		
	}
}
