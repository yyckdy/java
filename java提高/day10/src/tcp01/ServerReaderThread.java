package tcp01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReaderThread extends Thread {
    private final Socket socket;

    ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String msg;
            while ((msg = bufferedReader.readLine()) != null) {
                System.out.println(Thread.currentThread().getName() + "+" + socket.getRemoteSocketAddress() + ": " + msg);
            }
            System.out.println(socket.getRemoteSocketAddress().toString() + " 下线");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
