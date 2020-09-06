package com.spring.springpropertysource;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class MariaDbDataSource {

	@Bean(name="mariadb")
	@ConfigurationProperties(prefix = "spring.datasource")
//	@Qualifier
	
	public DataSource mariaDbSource() {
		System.out.println("Building mariadb datasource");
		return DataSourceBuilder.create().build();

	}
	
	@Bean(name="jdbcTemplateMariadb")
	public JdbcTemplate jdbcTemplateMariadb(@Qualifier("mariadb") DataSource ds) {
		System.out.println(ds.toString());

		return new JdbcTemplate(ds);
	}
}
