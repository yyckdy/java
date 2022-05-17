package annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 注解的解析
 */
public class Demo3 {
    @Test
    public void passClass() throws Exception {
        //得到类对象
        Class c = BookStore.class;
        Method method = c.getDeclaredMethod("test");
        if (method.isAnnotationPresent(Bookk.class)) {
            //获取注解对象
            Bookk book = (Bookk) method.getDeclaredAnnotation(Bookk.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.authors()));
        }

    }
}

@Bookk(value = "《情深深雨蒙蒙》", price = 99.9, authors = {"琼瑶", "dlei"})
class BookStore {
    @Bookk(value = "《三少爷的剑》", price = 399.9, authors = {"古龙", "熊耀华"})
    public void test() {

    }
}
