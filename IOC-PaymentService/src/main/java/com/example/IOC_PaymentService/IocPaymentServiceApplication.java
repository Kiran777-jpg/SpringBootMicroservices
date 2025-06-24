package com.example.IOC_PaymentService;

import com.example.IOC_PaymentService.services.RestaurantService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class IocPaymentServiceApplication {

	public static void main(String[] args) {
		System.out.println("Hello World");
		SpringApplication.run(IocPaymentServiceApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		RestaurantService rs = context.getBean(RestaurantService.class);
		rs.startBIll();
	}

}
