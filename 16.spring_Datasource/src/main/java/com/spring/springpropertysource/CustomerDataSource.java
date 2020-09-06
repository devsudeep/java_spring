package com.spring.springpropertysource;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class CustomerDataSource {

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	@Primary
	public HikariDataSource dataSource() {
		System.out.println("Building datasource");
		return DataSourceBuilder.create().type(HikariDataSource.class).build();

	}
}
