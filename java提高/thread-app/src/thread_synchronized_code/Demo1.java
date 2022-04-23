package thread_synchronized_code;

/**
 * 线程安全问题
 */
public class Demo1 {
    public static void main(String[] args) {
        // 定义线程类
        Account acc = new Account("10086", 100000);

        Account acc1 = new Account("10086", 100000);

        new DrawThread(acc1, "小明").start();

        new DrawThread(acc1, "小红").start();

        new DrawThread(acc, "小黑").start();

        new DrawThread(acc, "小黄").start();

    }
}
