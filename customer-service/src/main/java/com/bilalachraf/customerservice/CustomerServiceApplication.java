package com.bilalachraf.customerservice;

import com.bilalachraf.customerservice.entities.Customer;
import com.bilalachraf.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository repository)
    {
        return args -> {
            repository.save(new Customer(null,"Bilal Achraf","user-1@mail.com"));
            repository.save(new Customer(null,"Bilal Ayman" ,"user-2@mail.com"));
            repository.save(new Customer(null,"Bilal Salim" ,"user-3@mail.com"));
            repository.save(new Customer(null,"Sami Achraf" ,"user-4@mail.com"));
        };
    }

}
