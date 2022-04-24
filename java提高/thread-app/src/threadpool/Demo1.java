package threadpool;

import java.util.concurrent.*;

/**
 * 自定义一个线程池对象
 */
public class Demo1 {
    public static void main(String[] args) {
        /**
         public ThreadPoolExecutor(int corePoolSize,
         int maximumPoolSize,
         long keepAliveTime,
         TimeUnit unit,
         BlockingQueue<Runnable> workQueue)
         */
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 6, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());

        //给任务线程池处理
        Runnable target = new MyRunnable();
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);


        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        //创建临时线程
        pool.execute(target);
        pool.execute(target);
        //不创建
        pool.execute(target);

        //关闭线程池
//        pool.shutdownNow();//立即关闭 会丢失任务
        pool.shutdown();//任务执行完后关闭
    }
}
