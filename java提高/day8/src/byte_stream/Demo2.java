package byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 每次读取一个字节数组的数据 字节流
 */
public class Demo2 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("java/java提高/day8/src/data.txt");//简化写法
        //定义一个字节数组读取数据
//        byte[] bytes = new byte[3];//3b
//        int len= is.read(bytes);
//        System.out.printf("读取了%d个字节\n",len);
//        String rs = new String(bytes,0,len);//解码
//        System.out.println(rs);
//
//        int len1= is.read(bytes);
//        System.out.printf("读取了%d个字节\n",len1);
//        String rs1 = new String(bytes,0,len1);//解码
//        System.out.println(rs1);
//
//        int len2= is.read(bytes);
//        System.out.printf("读取了%d个字节\n",len2);
//        String rs2 = new String(bytes,0,len2);//解码
//        System.out.println(rs2);
        File f = new File("java/java提高/day8/src/data.txt");
        long length = f.length();
        //循环读取
        byte[] buffer = new byte[((int) length)];
        int len = 0;//记录每次读取字节数
        while ((len = is.read(buffer)) != -1) {
            System.out.print(new String(buffer, 0, len));
        }

    }
}
