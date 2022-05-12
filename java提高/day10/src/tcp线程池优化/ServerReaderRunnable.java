package tcp线程池优化;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReaderRunnable implements Runnable {
    private Socket socket;

    public ServerReaderRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String msg;
            while ((msg = bufferedReader.readLine()) != null) {
                System.out.println(socket.getRemoteSocketAddress().toString() + ": " + msg);
            }
            System.out.println(socket.getRemoteSocketAddress().toString()+"下线了");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
