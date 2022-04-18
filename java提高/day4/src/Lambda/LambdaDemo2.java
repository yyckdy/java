package Lambda;

public class LambdaDemo2 {
    public static void main(String[] args) {
        //Lambda只能简化接口中只有一个抽象方法的匿名内部类

        go(() -> System.out.println("hello world"));

    }

    public static void go(Swimming s) {
        System.out.println("开始");
        s.swim();
        System.out.println("结束");
    }
}

@FunctionalInterface //必须是函数式接口
interface Swimming {
    void swim();
}
