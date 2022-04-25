package printStream;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * 打印流
 */
public class PrintDemo1 {
    public static void main(String[] args) throws Exception {
        PrintStream ps = new PrintStream(new FileOutputStream("java/java提高/day9/src/ps01.txt", true));

        PrintWriter ps1 = new PrintWriter("java/java提高/day9/src/ps02.txt");

        ps1.println(Thread.currentThread().getName());
        ps1.write("hello,world");
        ps1.flush();
        ps1.close();

    }
}
