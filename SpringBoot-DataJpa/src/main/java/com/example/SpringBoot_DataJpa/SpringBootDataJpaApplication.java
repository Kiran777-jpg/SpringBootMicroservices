package com.example.SpringBoot_DataJpa;

import com.example.SpringBoot_DataJpa.entity.Product;
import com.example.SpringBoot_DataJpa.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDataJpaApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDataJpaApplication.class, args);
		ProductService productService = context.getBean(ProductService.class);

//		Product product = productService.getProductById(1);
//		System.out.println(product.getName());
//		System.out.println(product.toString());
//
//		Product product = productService.getProductByName("Watch");
//		System.out.println(product.getDescription());

//		productService.getProductGreaterthanPrice(1200);

//		productService.callCustomQueries();
//		productService.saveProducts();

		try {
			productService.saveProductWithException();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
