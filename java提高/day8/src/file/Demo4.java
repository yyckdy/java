package file;

import java.io.File;

public class Demo4 {
    public static void main(String[] args) {
        File f1 = new File("/Users/yy/docs");
        String[] names = f1.list();
        for (String name : names) {
            System.out.println(name);
        }
        File[]files=f1.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
