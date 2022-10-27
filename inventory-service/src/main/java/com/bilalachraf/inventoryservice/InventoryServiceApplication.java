package com.bilalachraf.inventoryservice;

import com.bilalachraf.inventoryservice.entities.Product;
import com.bilalachraf.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ProductRepository repository)
	{
		return args -> {

			for (int i = 1; i <= 20; i++) {
				repository.save(new Product(null,String.format("Product no %d",i)));
			}
		};
	}

}
