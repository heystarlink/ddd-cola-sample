package com.cola.sample.infrastructure.gatewayimpl;

import com.cola.sample.domain.order.entity.OrderEntity;
import com.cola.sample.domain.order.entity.OrderItem;
import com.cola.sample.domain.order.entity.Product;
import com.cola.sample.domain.order.gateway.OrderGateway;
import com.cola.sample.infrastructure.mapper.OrderMapper;
import com.cola.sample.infrastructure.mapper.ProductMapper;
import com.cola.sample.infrastructure.model.OrderDO;
import com.cola.sample.infrastructure.model.ProductDO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author : kenny
 * @since : 2023/8/13
 **/
public class OrderGatewayImpl implements OrderGateway {
    private OrderMapper orderMapper;

    private ProductMapper productMapper;

    @Override
    public OrderEntity saveOrder(OrderEntity orderEntity) {
        OrderDO orderDO  = new OrderDO();
        if (orderEntity.getId() != null){
            // 已存在订单记录
            orderDO = orderMapper.getById(orderEntity.getId());
        }

        orderDO.setOrderNumber(orderEntity.getOrderNumber());
        orderDO.setOrderCategoryType(orderEntity.getOrderCategoryType());
        orderDO.setStatus(orderEntity.getStatus());

        long orderId = orderMapper.save(orderDO);

        OrderItem orderItem = orderEntity.getOrderItem();
        if (orderItem != null){
            List<Product> products =  orderItem.getProduct();
            products = Optional.ofNullable(products).orElseGet(ArrayList::new);
            for (Product product : products){
                ProductDO productDO = new ProductDO();
                productDO.setOrderId(orderId);
                productDO.setName(product.getName());
                productDO.setPrice(product.getPrice());
                productMapper.save(product);
            }
        }

        return new OrderEntity();
    }
}
