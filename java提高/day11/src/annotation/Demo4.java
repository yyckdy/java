package annotation;

import java.lang.reflect.Method;

public class Demo4 {
    @MyTest
    public void test1() {
        System.out.println("=====test1=====");
    }

    public void test2() {
        System.out.println("=====test2=====");
    }

    @MyTest
    public void test3() {
        System.out.println("=====test3=====");
    }

    /**
     * 启动菜单
     */
    public static void main(String[] args) throws Exception {
        Class c = Demo4.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)) {
                method.invoke(new Demo4());
            }
        }
    }
}
