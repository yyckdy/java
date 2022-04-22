package create;

/**
 * 多线程的创建方式1 继承Thread类
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        //new 一个新线程对象
        Thread t = new MyThread();
        //调用start方法启动线程
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出：" + i);
        }

    }
}

/**
 * 定义一个线程类
 */
class MyThread extends Thread {
    /*
      重写run方法 定义线程的作用
     */

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程执行输出:" + i);
        }
    }
}
