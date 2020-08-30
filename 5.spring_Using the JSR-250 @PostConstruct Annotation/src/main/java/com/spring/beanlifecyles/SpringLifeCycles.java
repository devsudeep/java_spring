package com.spring.beanlifecyles;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.modelbeans.SingerWithJSR250;

import ch.qos.logback.classic.Logger;
import javafx.application.Application;

//@SpringBootApplication
//@EnableCaching
public class SpringLifeCycles extends SpringBootServletInitializer {
	final static Logger logger = (Logger) LoggerFactory.getLogger(SpringLifeCycles.class);
//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(SpringLifeCycles.class);
//	}

	public static void main(String[] args) {
//		SpringApplication.run(SpringLifeCycles.class, args);

		GenericXmlApplicationContext context = new GenericXmlApplicationContext();

		context.load("classpath:spring/app-context.xml");
		context.refresh();

		getBean("SingleOne", context);
		getBean("SingleTwo", context);
		getBean("SingerThree", context);

		getBean("SingleOne", context);		
		getBean("SingleOne", context);

		getBean("SingleOne", context);


		context.close();
	}

	private static SingerWithJSR250 getBean(String beanName, ApplicationContext context) {
		// TODO Auto-generated method stub
		try {
			SingerWithJSR250 bean = (SingerWithJSR250) context.getBean(beanName);
			return bean;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("An error occured in bean configuration: " + e.getMessage());
			return null;
		}
	}

}
