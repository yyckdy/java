package reflect_method;

import org.junit.Test;

import java.lang.reflect.Method;

public class TestMethods {
    @Test
    public void getDeclaredMethods() {
        Class c = Methods.class;
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + " " + method.getReturnType());
        }
    }

    @Test
    public void getDeclaredMethod() throws Exception {
        Class c = Methods.class;
        Method method = c.getDeclaredMethod("add", int.class, int.class);
        //执行
        Methods m = new Methods();
        System.out.println(method.invoke(m, 10, 20));
        int[] arr = {10, 20, 30, 40, 50};
        Method method1 = c.getDeclaredMethod("print", int[].class);
        method1.setAccessible(true);
        method1.invoke(m, arr);
    }
}
