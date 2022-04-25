package transfer;


import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 字节缓冲流
 */
public class Demo1 {
    public static void main(String[] args) {
        //   /Users/yy/Documents/未命名文件夹/test.txt
        try (
                InputStream inputStream = new FileInputStream("/Users/yy/Desktop/SQLQuery4.21.sql");
                Reader isr = new InputStreamReader(inputStream, "GBK");
                BufferedReader br = new BufferedReader(isr);

                OutputStream outputStream =new FileOutputStream("/Users/yy/Desktop/new.sql");
                Writer writer=new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
                BufferedWriter bufferedWriter=new BufferedWriter(writer);
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                bufferedWriter.write(line+"\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
