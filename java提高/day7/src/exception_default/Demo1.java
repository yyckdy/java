package exception_default;

public class Demo1 {
    public static void main(String[] args) {
        //异常默认处理机制
        try {
            chu(10, 0);
        } catch (Exception e) {
            System.out.println("计算有误");
        }
    }

    public static void chu(int a, int b) {
        System.out.println(a);
        System.out.println(b);
        int c = a / b;
        System.out.println(c);
    }
}
