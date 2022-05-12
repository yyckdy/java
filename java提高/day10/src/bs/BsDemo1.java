package bs;

import tcp线程池优化.ServerReaderRunnable;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class BsDemo1 {
    private static ExecutorService pool = new ThreadPoolExecutor(3, 5, 6,
            TimeUnit.SECONDS, new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(9999);
            while (true) {
                Socket socket = ss.accept();
                pool.execute(new ServerReaderRunnable(socket));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

