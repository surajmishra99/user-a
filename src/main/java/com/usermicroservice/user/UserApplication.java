package com.usermicroservice.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
public class UserApplication extends SpringBootServletInitializer {
//extends SpringBootServletInitializer
	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(UserApplication.class);
	}

}
