package create;

/**
 * 线程的创建方式2 可以继续继承一个类
 * 会多包装一层对象 不能返回结果
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        Runnable target = new MyRunnable();//创建任务对象
        Thread t = new Thread(target);//任务对象交给线程对象
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行输出：" + i);
        }
    }
}

/**
 * 定义一个线程任务类 实现Runnable接口
 */
class MyRunnable implements Runnable {
    @Override
    public void run() {
        /*
        定义线程任务
         */
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程执行输出：" + i);
        }
    }
}
