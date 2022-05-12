package tcp线程池优化;

import tcp01.ServerReaderThread;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

//服务端
public class NewDemo2 {
    //静态变量存储一个线程池
    private static ExecutorService pool = new ThreadPoolExecutor(3, 5, 6,
            TimeUnit.SECONDS, new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {
        try {
            System.out.println("==服务端启动成功===");
            ServerSocket serverSocket = new ServerSocket(9999);
            while (true) {
                //将接到的socket封装为任务对象
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress() + "上线了");
                Runnable target = new ServerReaderRunnable(socket);
                pool.execute(target);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
