package annotation;

public @interface BOOK {
    String value();//特殊属性

    double price() default 999.99;//默认值可以省略
}
