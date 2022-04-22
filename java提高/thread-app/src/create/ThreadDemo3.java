package create;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 线程创建方式3 实现Callable接口，结合FutureTask
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        //创建任务对象
        Callable<String> call = new MyCallable(100);
        //把Callable任务对象交给FutureTask(Runnable的对象，可以交给Thread,得到返回值）
        FutureTask<String> f1 = new FutureTask<>(call);
        new Thread(f1).start();
        try {
            //如果f1没有执行完，这里的代码会等待f1执行完
            System.out.println(f1.get());//得到线程执行返回值
        } catch (Exception e) {
            e.printStackTrace();
        }

        //第一个线程结束

        //创建任务对象
        Callable<String> call2 = new MyCallable(200);
        //把Callable任务对象交给FutureTask(Runnable的对象，可以交给Thread,得到返回值）
        FutureTask<String> f2 = new FutureTask<>(call2);
        new Thread(f2).start();
        try {
            System.out.println(f2.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/**
 * 定义一个任务类,声明线程任务执行完毕后结果的数据类型
 */
class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    //重写call方法
    @Override
    public String call() {
        //求1-n的和
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return "子线程执行的结果是：" + sum;
    }
}
