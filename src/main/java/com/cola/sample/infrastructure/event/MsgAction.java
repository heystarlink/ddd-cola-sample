package com.cola.sample.infrastructure.event;

/**
 * @author : kenny
 * @since : 2023/8/13
 **/
public interface MsgAction<T> {

    void send(T t);
}
