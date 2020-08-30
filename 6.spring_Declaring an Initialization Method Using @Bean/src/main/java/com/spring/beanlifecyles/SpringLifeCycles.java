package com.spring.beanlifecyles;

import java.util.Map;

import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.GenericApplicationContext;

import com.spring.modelbeans.Singer;

import ch.qos.logback.classic.Logger;

//@SpringBootApplication
//@EnableCaching
public class SpringLifeCycles extends SpringBootServletInitializer {
	final static Logger logger = (Logger) LoggerFactory.getLogger(SpringLifeCycles.class);

//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(SpringLifeCycles.class);
//	}
	@Configuration
	static class SingerConfig {

		@Lazy
		@Bean(initMethod = "init")
		Singer singerOne() {
			Singer singerOne = new Singer();
			singerOne.setName("John Mayer");
			singerOne.setAge(39);
			return singerOne;
		}

		@Lazy
		@Bean(initMethod = "init")
		Singer singerTwo() {
			Singer singerOne = new Singer();
			singerOne.setName("John Mayer");
			singerOne.setAge(39);
			return singerOne;
		}

		@Lazy
		@Bean(initMethod = "init")
		Singer singerThree() {
			Singer singerThree = new Singer();
			singerThree.setName("John Butler");
			return singerThree;
		}

		public static void main(String[] args) {
//		SpringApplication.run(SpringLifeCycles.class, args);

			GenericApplicationContext context = new AnnotationConfigApplicationContext(SingerConfig.class);

//		context.refresh();
			Map<String, Singer> beans = context.getBeansOfType(Singer.class);

			System.out.println(beans.size());

			getBean("singerOne", context);

			context.close();
		}

		private static Singer getBean(String beanName, ApplicationContext context) {
			// TODO Auto-generated method stub
			try {
				Singer bean = (Singer) context.getBean(beanName);
				return bean;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("An error occured in bean configuration: " + e.getMessage());
				return null;
			}
		}

	}
}
