package com.ty.studentapp.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ty.studentapp")
public class MyConfig {
	@Bean
	public EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("manoj");
		return factory.createEntityManager();
	}
	@Bean
	public EntityTransaction getEntityTransaction() {
		EntityManager manager = getEntityManager();
		return manager.getTransaction();
	}
}
