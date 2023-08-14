package api.annotation;

/**
 * @author : kenny
 * @since : 2023/8/13
 **/
public @interface FeignClient {
    String name() default "";
    String value() default "";
}
