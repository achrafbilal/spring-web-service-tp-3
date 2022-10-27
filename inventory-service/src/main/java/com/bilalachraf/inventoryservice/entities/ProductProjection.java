package com.bilalachraf.inventoryservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class,name = "fullProduct")
public interface ProductProjection extends Projection{
    Long getId();
    String getLabel();
}
