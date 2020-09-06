//package com.spring.springpropertysource;
//
//import javax.sql.DataSource;
//
//import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
//import com.zaxxer.hikari.HikariDataSource;
//
//@Configuration
//public class CustomerDataSource2 {
//
//	@Bean
//	@Primary
//
//	@ConfigurationProperties("spring.datasource")
//	public DataSourceProperties datasourceProperties() {
//		return new DataSourceProperties();
//	}
//
//	@Bean(name = "HKDS")
//	@Primary
//	@ConfigurationProperties("spring.datasource")
//	public HikariDataSource dataSource(DataSourceProperties dsp) {
//		System.out.println("Building datasource");
//		System.out.println(dsp);
//		return dsp.initializeDataSourceBuilder().type(HikariDataSource.class).build();
//
//	}
//}
