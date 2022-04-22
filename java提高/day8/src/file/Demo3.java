package file;

import java.io.File;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        File f = new File("java/java提高/day8/src/file/data.txt");
        //创建文件
        System.out.println(f.createNewFile());
        File f1 = new File("java/java提高/day8/src/file/data01.txt");
        System.out.println(f1.createNewFile());

        //创建一级目录
        File f3 = new File("java/java提高/day8/src/file/aaa");
        System.out.println(f3.mkdir());
        //创建多级目录
        File f4 = new File("java/java提高/day8/src/file/aaa/bbb/ccc");
        System.out.println(f4.mkdirs());

        System.out.println(f1.delete());

        File f5=new File("/Users/yy/Desktop/文件/1.png");
        System.out.println(f5.delete());//不能删除非空文件夹


    }
}
