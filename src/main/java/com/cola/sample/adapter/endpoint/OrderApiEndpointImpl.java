package com.cola.sample.adapter.endpoint;

import api.annotation.Api;
import api.endpoint.OrderApiEndpoint;
import api.model.dto.Request;
import api.model.dto.Response;
import api.model.param.OrderSaveParam;
import com.cola.sample.application.service.OrderApp;

/**
 * @author : kenny
 * @since : 2023/8/13
 **/
@Api(tags = "订单服务")
public class OrderApiEndpointImpl implements OrderApiEndpoint {
    private static final OrderApp orderApp = new OrderApp();

    @Override
    public Response<Boolean> save(Request<OrderSaveParam> request) {
        return new Response<>(orderApp.save(request.getBody()));
    }
}
