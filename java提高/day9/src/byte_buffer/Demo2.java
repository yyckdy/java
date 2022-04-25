package byte_buffer;

import java.io.*;

/**
 * 字节缓冲流性能分析
 */
public class Demo2 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream("/Users/yy/Downloads/ideaIU-2021.3.3.dmg");
                //把原始的字节输入流包装成高级的缓冲字节输入流
                InputStream bis = new BufferedInputStream(is);

                OutputStream os = new FileOutputStream("/Users/yy/Desktop/new.dmg");
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
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
}
