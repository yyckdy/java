package exception_handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 处理方式1 throws
 */
public class Demo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("程序开始");
        parseTime("2011-11-11 11:11:11");
        System.out.println("程序结束");
    }

    public static void parseTime(String date) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(date);
        System.out.println(d);

        InputStream is = new FileInputStream("yy:/mei");
    }
}
