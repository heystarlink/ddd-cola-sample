package com.cola.sample.infrastructure.mapper;

import java.util.List;

/**
 * @author : kenny
 * @since : 2023/8/13
 **/
public interface BaseMapper<T>{
    <T> Long save(T t);

    <T> T getById(Long t);

    <T> List<T> findAll(T t);
}
