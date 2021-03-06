package io.alka.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootStrater1Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStrater1Application.class, args);
	}
	@Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	      return application.sources(SpringBootStrater1Application.class);
	   }
}
