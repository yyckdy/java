package threadpool;

import java.util.concurrent.*;

/**
 * 自定义一个线程池对象
 */
public class Demo3 {
    public static void main(String[] args) throws Exception {
        /**
         public ThreadPoolExecutor(int corePoolSize,
         int maximumPoolSize,
         long keepAliveTime,
         TimeUnit unit,
         BlockingQueue<Runnable> workQueue)
         */
        ExecutorService pool = Executors.newFixedThreadPool(3);

        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());


    }
}
