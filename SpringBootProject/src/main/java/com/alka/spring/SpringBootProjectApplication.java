package com.alka.spring;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.alka.topic.*","com.alka.course.*"})
public class SpringBootProjectApplication implements ApplicationRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Spring boot application has been started...");
		
	}

}
