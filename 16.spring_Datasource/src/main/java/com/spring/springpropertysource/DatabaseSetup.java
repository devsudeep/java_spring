package com.spring.springpropertysource;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;


public class DatabaseSetup {//...
	@Autowired
	@Qualifier("mariadb")
	private DataSource dataSource;
	
	
	public void createDefaultDB(@Qualifier("maridb") DataSource dataSource) {
	    Resource resource = new ClassPathResource("CreateDefaultDB.sql");
	    ResourceDatabasePopulator databasePopulator = new ResourceDatabasePopulator(resource);
	    databasePopulator.execute(dataSource);
	}
	
	
}
