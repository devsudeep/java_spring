package com.spring.springpropertyeditors;

import java.io.File;
import java.io.IOException;

import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.support.GenericXmlApplicationContext;

import ch.qos.logback.classic.Logger;

//@SpringBootApplication
//@EnableCaching
public class SpringPropertyEditorsMain extends SpringBootServletInitializer {
	final static Logger logger = (Logger) LoggerFactory.getLogger(SpringPropertyEditorsMain.class);

//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(SpringLifeCycles.class);
//	}
	public static void main(String... args) throws IOException {
		File file = File.createTempFile("test", "txt");
		file.deleteOnExit();

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context.xml");
		ctx.refresh();

		PropertyEditorBean bean = (PropertyEditorBean) ctx.getBean("builtInSample");
		bean.setTrimString("Sudep             ");
		
		
		
		ctx.close();

	}
}
