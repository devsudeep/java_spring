package com.spring.beanawareapp;

import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.support.GenericXmlApplicationContext;

import ch.qos.logback.classic.Logger;

//@SpringBootApplication
//@EnableCaching
public class SpringBeanAware extends SpringBootServletInitializer {
	final static Logger logger = (Logger) LoggerFactory.getLogger(SpringBeanAware.class);

//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(SpringLifeCycles.class);
//	}
	public static void main(String... args) {
		GenericXmlApplicationContext  ctx  =
	            new GenericXmlApplicationContext();
	        ctx.load("classpath:spring/app-context.xml");
	        ctx.refresh();
	        NamedSinger bean = (NamedSinger) ctx.getBean("johnMayer");
	        bean.sing();
	        System.out.println(bean);
	        ctx.close();

	}
}
