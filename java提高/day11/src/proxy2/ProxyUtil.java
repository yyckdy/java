package proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static <T>T getProxy(UserService obj) {
        return (T) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), (proxy, method, args) -> {
            long startTime = System.currentTimeMillis();
            Object rs = method.invoke(obj, args);
            long endTime = System.currentTimeMillis();
            System.out.println(method.getName() + " 方法耗时" + (endTime - startTime) + "ms");
            return rs;
        });
    }
}
