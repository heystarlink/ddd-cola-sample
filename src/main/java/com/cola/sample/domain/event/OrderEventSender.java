package com.cola.sample.domain.event;

import api.model.dto.OrderMsgDTO;
import com.cola.sample.infrastructure.event.BaseProducer;

/**
 * @author : kenny
 * @since : 2023/8/13
 **/
public class OrderEventSender extends BaseProducer<OrderMsgDTO> {

    @Override
    public void send(OrderMsgDTO msgDTO) {

    }
}
