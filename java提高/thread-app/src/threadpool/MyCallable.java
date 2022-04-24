package threadpool;

import java.util.concurrent.Callable;

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
        return Thread.currentThread().getName() + "执行1-" + n + "的和的结果是：" + sum;
    }
}
