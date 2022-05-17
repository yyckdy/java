package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//生命周期 运行阶段 约束注解的存活范围
@Target(ElementType.METHOD) //元注解 方法和成员变量 注解注解的注解
public @interface MyTest {

}

