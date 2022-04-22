package resours;

import java.io.*;

/**
 * tryCatchFinally
 */
public class Demo1 {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream("/Users/yy/Desktop/打造数字经济新优势.docx");
            os = new FileOutputStream("/Users/yy/Desktop/new.docx", false);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            byte[] buffer = new byte[1024];
            int len;
            long start = System.currentTimeMillis();
            while (true) {
                assert is != null;
                if (!((len = is.read(buffer)) > 0)) break;
                assert os != null;
                os.write(buffer, 0, len);
            }
            long end = System.currentTimeMillis();
            System.out.println("花费时间" + (end - start) + "毫秒");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //不建议return
            try {
                if (os != null) {
                    os.close();//资源释放
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
