package com.example.Spring_Jdbc_Xml;

import com.example.Spring_Jdbc_Xml.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringJdbcXmlApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringJdbcXmlApplication.class, args);
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml");
		ProductService bookService = ctxt.getBean(ProductService.class);
		bookService.saveProduct();
	}

}
