package com.neuron.groceries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.neuron.groceries.repository")
@SpringBootApplication
public class GroceriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroceriesApplication.class, args);
	}

}
