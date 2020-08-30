package com.spring.springfactorybean;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.support.GenericXmlApplicationContext;

import ch.qos.logback.classic.Logger;

//@SpringBootApplication
//@EnableCaching
public class SpringBeanFactory extends SpringBootServletInitializer {
	final static Logger logger = (Logger) LoggerFactory.getLogger(SpringBeanFactory.class);

//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(SpringLifeCycles.class);
//	}
	public static void main(String... args) throws NoSuchAlgorithmException {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context.xml");
		ctx.refresh();
		MessageDigester mdigester = (MessageDigester) ctx.getBean("digester", MessageDigester.class);
		mdigester.digest("Hello world");
		
       MessageDigest sha = ctx.getBean("shaDigest", MessageDigest.class);
       System.out.println(sha.digest("hello world".getBytes()));
		ctx.close();

	}
}
