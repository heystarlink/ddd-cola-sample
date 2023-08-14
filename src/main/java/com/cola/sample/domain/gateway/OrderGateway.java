package com.cola.sample.domain.gateway;

import com.cola.sample.domain.entity.OrderEntity;

/**
 * @author : kenny
 * @since : 2023/8/13
 **/
public interface OrderGateway {
    OrderEntity saveOrder(OrderEntity orderEntity);
}
