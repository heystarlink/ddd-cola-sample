package com.cola.sample.application.service;

import api.model.param.OrderSaveParam;
import com.cola.sample.domain.order.service.OrderDomainService;
import com.cola.sample.domain.order.model.req.CreateOrderRequest;
import com.cola.sample.infrastructure.annotation.spring.Transactional;

/**
 * @author : kenny
 * @since : 2023/8/13
 **/
public class OrderApp {

    private static final OrderDomainService orderDomainService = new OrderDomainService();

    /**
     * 订单保存
     * @param orderSaveParam
     * @return
     */
    @Transactional
    public Boolean save(OrderSaveParam orderSaveParam){
        CreateOrderRequest createOrderRequest = CreateOrderRequest.CreateOrderRequestBuilder.aCreateOrderRequest()
                .withBillingDTO(orderSaveParam.getBillingDTO())
                .withCustomerDTO(orderSaveParam.getCustomerDTO())
                .withShippingType(orderSaveParam.getShippingType())
                .withOrderCategoryType(orderSaveParam.getOrderCategoryType())
                .withOrderNote(orderSaveParam.getOrderNote())
                .build();
        orderDomainService.createOrder(createOrderRequest);
        return Boolean.TRUE;
    }
}
