package com.bilalachraf.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}

	@Bean
	RouteLocator gatewayRoutes(RouteLocatorBuilder builder)
	{
		return builder.routes()
				.route(r-> r.path("/customers/**").uri("lb://CUSTOMER-SERVICE"))
				.route(r-> r.path("/products/**").uri("lb://INVENTORY-SERVICE"))
				.build();
	}

}
