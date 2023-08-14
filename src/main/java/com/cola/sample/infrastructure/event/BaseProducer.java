package com.cola.sample.infrastructure.event;

import api.model.dto.BaseMsgDTO;

/**
 * @author : kenny
 * @since : 2023/8/13
 **/
public abstract class BaseProducer<T extends BaseMsgDTO> implements MsgAction<T>{
}
