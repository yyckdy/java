package resours;

import java.io.*;

public class Demo2 {
    public static void main(String[] args) {
        try (//只能方资源
             InputStream is = new FileInputStream("/Users/yy/Desktop/打造数字经济新优势.docx");//自动关闭
             OutputStream os = new FileOutputStream("/Users/yy/Desktop/new.docx", false);//自动关闭
             myClose m = new myClose();//自动调用关闭
        ) {
            byte[] buffer = new byte[1024];
            int len;
            long start = System.currentTimeMillis();
            while ((len = is.read(buffer)) > 0) {
                os.write(buffer, 0, len);
            }
            long end = System.currentTimeMillis();
            System.out.println("花费时间" + (end - start) + "毫秒");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class myClose implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("资源释放成功");
    }
}
