package com.example.IOC_PaymentService_02;

import com.example.IOC_PaymentService_02.service.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class IocPaymentService02Application {

	public static void main(String[] args) {

		SpringApplication.run(IocPaymentService02Application.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserServiceImpl userService = context.getBean(UserServiceImpl.class);
		String name = userService.getName(1);
		System.out.println(name);
	}

}
