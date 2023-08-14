package api.annotation;

/**
 * @author : kenny
 * @since : 2023/8/13
 **/
public @interface PostMapping {
    String name() default "";


    String[] value() default {};


    String[] path() default {};


    String[] params() default {};


    String[] headers() default {};


    String[] consumes() default {};

    String[] produces() default {};
}
