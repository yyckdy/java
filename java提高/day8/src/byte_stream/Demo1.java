package byte_stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        //创建一个字节输入流管道与源文件接通
//        InputStream is = new FileInputStream(new File("java/java提高/day8/src/data.txt"));
        InputStream is = new FileInputStream("java/java提高/day8/src/data.txt");//简化写法

        //读取一个字节返回
//        System.out.println(is.read());
//        System.out.println(is.read());
//        System.out.println(is.read());
//        System.out.println(is.read());

        //使用循环读取
        int b;
        while ((b = is.read()) != -1) {
            System.out.print((char) b);
        }//无法读取中文


    }
}
