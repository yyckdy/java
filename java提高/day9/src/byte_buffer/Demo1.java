package byte_buffer;

import java.io.*;

/**
 * 字节缓冲流
 */
public class Demo1 {
    public static void main(String[] args) {
        try (
                InputStream is = new FileInputStream("/Users/yy/IdeaProjects/java/java提高/day9/src/out01.txt");
                //把原始的字节输入流包装成高级的缓冲字节输入流
                InputStream bis = new BufferedInputStream(is);

                OutputStream os = new FileOutputStream("/Users/yy/IdeaProjects/java/java提高/day9/src/out02.txt");
                //把字节输出流管道包装成高级的缓冲字节流输出管道
                OutputStream bos = new BufferedOutputStream(os)
        ) {
            byte[] buffer = new byte[1024];
            int len;
            //从缓冲区域读取
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
