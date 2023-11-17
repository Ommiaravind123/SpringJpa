package com.springJpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springJpa.entity.Product;
import com.springJpa.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		ProductRepository bean = run.getBean(ProductRepository.class);
		
		Product p = new Product();
		
		p.setId(id);
		
	}

}