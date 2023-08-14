package com.cola.sample.domain.order.helper;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author : kenny
 * @since : 2023/8/13
 **/
public class OrderNumberFactory {
    private static final String PREFIX = "ORD"; // 订单号前缀
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyyMMddHHmmss");
    private static AtomicLong counter = new AtomicLong(0);

    public static String generateOrderNumber() {
        Date now = new Date();
        long nextValue = counter.incrementAndGet();
        return PREFIX + DATE_FORMAT.format(now) + String.format("%05d", nextValue);
    }
}
