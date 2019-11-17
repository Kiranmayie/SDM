package com.concordia.app.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@ComponentScan("com.concordia.app")
@Configuration
public class ApplicationConfig {

	@Bean(name="basicDataSource")
	public BasicDataSource getBasicDataSource() {
		
		BasicDataSource basicDataSource = new BasicDataSource();
		
		basicDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/carrental?autoReconnect=true&useSSL=false");
		//basicDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/carrental?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=GMT");
		basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		basicDataSource.setUsername("root");
		basicDataSource.setPassword("root");
		basicDataSource.setInitialSize(5) ;
		basicDataSource.setMaxTotal(10) ;
		
		return basicDataSource;
		
	}
	
	@Bean(name="jdbc Template")
	
	public JdbcTemplate getJdbcTemplate() {
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		
		jdbcTemplate.setDataSource(getBasicDataSource());
		
		return jdbcTemplate;
	}
	
	
}
