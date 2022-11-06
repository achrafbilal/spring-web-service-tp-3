package com.bilalachraf.customerservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(types = Customer.class,name = "fullCustomer")
public interface CustomerProjection extends Projection {
    Long getId();
    String getName();
    String getEmail();
}
