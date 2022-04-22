package file;

import java.io.File;
import java.text.SimpleDateFormat;

public class Demo2 {
    public static void main(String[] args) {
        File f = new File("/Users/yy/Desktop/文件/1.png");

        //获取绝对路径
        System.out.println(f.getAbsolutePath());
        //获取文件定义路径
        System.out.println(f.getPath());
        //文件名称
        System.out.println(f.getName());
        //文件大小
        System.out.println(f.length());
        //文件最后修改时间(毫秒值)
        System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(f.lastModified()));
        //判断是不是文件夹
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        //判断存在
        System.out.println(f.exists());
    }
}
