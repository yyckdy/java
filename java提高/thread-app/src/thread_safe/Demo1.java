package thread_safe;

/**
 * 线程安全问题
 */
public class Demo1 {
    public static void main(String[] args) {
        //定义线程类
        Account acc = new Account("10086", 100000);

        new DrawThread(acc, "小明").start();

        new DrawThread(acc, "小红").start();
    }
}

