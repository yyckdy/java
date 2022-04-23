package thread_communication;

/**
 * 线程通信流程
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //创建账户
        Account acc = new Account("10086", 0);
        //创建两个取钱线程
        new DrawThread(acc, "小明").start();
        new DrawThread(acc, "小明").start();
        //创建三个存钱线程
        new DepositThread(acc, "亲爹").start();
        new DepositThread(acc, "干爹").start();
        new DepositThread(acc, "岳父").start();
    }
}
