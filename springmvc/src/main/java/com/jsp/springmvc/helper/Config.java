 package com.jsp.springmvc.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan(basePackages ="com.jsp")
@Configuration
public class Config {
	@Bean
	public InternalResourceViewResolver resolver() {
  InternalResourceViewResolver resource = new InternalResourceViewResolver();
	   resource.setPrefix("/");
	   resource.setSuffix(".jsp");
	   return resource;
	}
	@Bean
	public EntityManagerFactory entityManagerFactory() {
		return Persistence.createEntityManagerFactory("iti");
	}
	
}
  