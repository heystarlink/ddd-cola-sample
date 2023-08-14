package com.cola.sample.domain.order.entity;

import java.util.List;

/**
 * @author : kenny
 * @since : 2023/8/13
 **/
public class OrderItem {
    private int quantity;
    private List<Product> product;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
}
