package static_demo3;

import static_demo2.ArrayUtil;

import java.util.ArrayList;

public class StaticDemo1 {

    public static String name;
    public static ArrayList<String> cards = new ArrayList<>();


    public static void main(String[] args) {
        //静态代码块
        System.out.println("--------main方法执行----------");
        System.out.println(name);
    }

    /**
     * 初始化静态资源
     */
    static {
        System.out.println("----------静态代码块被触发执行----------");
        cards.add("3");
        cards.add("4");
        name = "aaa";
    }
}
