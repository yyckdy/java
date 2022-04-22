package api;

public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread("1号");
        t1.start();
        System.out.println(t1.getName());
        Thread t2 = new MyThread("2号");
        t2.start();
        System.out.println(t2.getName());

        //当前线程对象
        Thread m = Thread.currentThread();
        m.setName("666");
        System.out.println(m.getName());

        for (int i = 0; i < 5; i++) {
            System.out.println(m.getName() + "线程输出:" + i);
        }

    }
}
