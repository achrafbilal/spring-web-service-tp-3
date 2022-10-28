package com.bilalachraf.billingservice;

import com.bilalachraf.billingservice.entities.Bill;
import com.bilalachraf.billingservice.repositories.BillRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BillingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillingServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(BillRepository repository)
	{
		return args -> {
			for (int i = 0; i < 30; i++) {
				repository.save(new Bill(null,Math.random()*100000));
			}
		};
	}

}
