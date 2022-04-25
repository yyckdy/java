package printStream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintDemo2 {
    public static void main(String[] args) throws Exception {
        PrintStream pr = new PrintStream(new FileOutputStream("java/java提高/day9/src/ps01.txt"), true);
        //输出重定向
        System.setOut(pr);

        System.out.println("hello");
    }
}
