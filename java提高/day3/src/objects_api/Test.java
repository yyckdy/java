package objects_api;

import java.util.Objects;

/**
 * objects 常用方法equals
 */
public class Test {
    public static void main(String[] args) {
        String s1 = null;
        System.out.println(Objects.isNull(s1));
        String s2 = "itheima";
        System.out.println(Objects.equals(s1, s2));
    }
}
