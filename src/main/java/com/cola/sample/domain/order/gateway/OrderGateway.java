package com.cola.sample.domain.order.gateway;

import com.cola.sample.domain.order.entity.OrderEntity;

/**
 * @author : kenny
 * @since : 2023/8/13
 **/
public interface OrderGateway {
    OrderEntity saveOrder(OrderEntity orderEntity);
}
