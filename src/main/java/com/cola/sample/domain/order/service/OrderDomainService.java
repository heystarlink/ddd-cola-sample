package com.cola.sample.domain.order.service;

import api.model.dto.OrderMsgDTO;
import com.cola.sample.domain.order.entity.OrderEntity;
import com.cola.sample.domain.order.event.OrderEventSender;
import com.cola.sample.domain.order.gateway.OrderGateway;
import com.cola.sample.domain.order.helper.OrderNumberFactory;
import com.cola.sample.domain.order.model.req.CreateOrderRequest;
import com.cola.sample.domain.order.model.resp.CreateOrderResponse;
import com.cola.sample.infrastructure.event.BaseProducer;
import com.cola.sample.infrastructure.gatewayimpl.OrderGatewayImpl;

/**
 * @author : kenny
 * @since : 2023/8/13
 **/
public class OrderDomainService {
    public static OrderGateway orderGateway = new OrderGatewayImpl();

    public static BaseProducer<OrderMsgDTO> orderEventSender = new OrderEventSender();

    /**
     * 订单创建领域服务
     * @param request
     * @return
     */
    public CreateOrderResponse createOrder(CreateOrderRequest request){
        OrderEntity orderEntity = new OrderEntity();
        String orderNumber = OrderNumberFactory.generateOrderNumber();
        orderEntity.setOrderNumber(orderNumber);
        orderEntity.setOrderCategoryType(request.getOrderCategoryType());
        orderGateway.saveOrder(orderEntity);

        OrderMsgDTO orderMsgDTO = new OrderMsgDTO();
        orderEventSender.send(orderMsgDTO);
        return new CreateOrderResponse();
    }
}
