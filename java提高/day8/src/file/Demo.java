package file;

import java.io.File;

/**
 * file对象
 */
public class Demo {
    public static void main(String[] args) {
        //创建file对象(文件路径)
        File f = new File("/Users/yy/Desktop/文件/1.png");
        System.out.println(f.length());//文件字节大小

        //支持绝对路径和相对路径(定位模块的文件)
        File f1 = new File("java/java提高/day8/src/file/data.txt");
        System.out.println(f1.length());

        //文件夹
        File f2 = new File("/Users/yy/Desktop/文件");
        System.out.println(f2.exists());//判断文件夹是否存在

    }
}
