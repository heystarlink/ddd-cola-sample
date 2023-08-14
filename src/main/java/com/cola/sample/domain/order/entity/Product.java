package com.cola.sample.domain.order.entity;

import java.math.BigDecimal;

/**
 * @author : kenny
 * @since : 2023/8/13
 **/
public class Product {
    private Long id;
    private String name;
    private BigDecimal price;


    public Product() {
    }

    public Product(Long id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
