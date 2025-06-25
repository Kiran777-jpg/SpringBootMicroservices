package com.example.AutoWiringXml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AutoWiringXmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoWiringXmlApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ATM atm = context.getBean(ATM.class);
		atm.print();
	}

}
