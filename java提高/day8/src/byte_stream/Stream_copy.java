package byte_stream;

import java.io.*;
import java.util.Date;

public class Stream_copy {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("/Users/yy/Desktop/ubuntu-18.04.6-desktop-amd64.iso");
        OutputStream os = new FileOutputStream("/Users/yy/Desktop/new.iso", false);
        byte[] buffer = new byte[1048576];
        int len;
        long start = System.currentTimeMillis();
        while ((len = is.read(buffer)) > 0) {
            os.write(buffer, 0, len);
        }
        os.close();//资源释放
        long end = System.currentTimeMillis();
        System.out.println("花费时间" + (end - start) + "毫秒");
    }
}
