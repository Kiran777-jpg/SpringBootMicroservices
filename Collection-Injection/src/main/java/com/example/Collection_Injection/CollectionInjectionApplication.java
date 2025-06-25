package com.example.Collection_Injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CollectionInjectionApplication {

	public static void main(String[] args) {

		SpringApplication.run(CollectionInjectionApplication.class, args);
		ApplicationContext context =
				new ClassPathXmlApplicationContext("beans.xml");

		Student s = context.getBean(Student.class);

		System.out.println(s);//toString()
		System.out.println(s.hashCode());
	}

}
