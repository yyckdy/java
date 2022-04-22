package api;

public class MyThread extends Thread {
    public MyThread(String name) {
        //为当前线程设置名称
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "输出:" + i);
        }
    }
}
