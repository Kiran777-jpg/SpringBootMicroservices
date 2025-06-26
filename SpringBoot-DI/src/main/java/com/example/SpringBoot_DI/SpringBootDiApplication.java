package com.example.SpringBoot_DI;

import com.example.SpringBoot_DI.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDiApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDiApplication.class, args);
		UserService userService = context.getBean(UserService.class);
		userService.getName(100);
	}

}
