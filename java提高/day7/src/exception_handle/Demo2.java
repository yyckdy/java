package exception_handle;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * try ...catch 可以继续往下执行
 */
public class Demo2 {
    public static void main(String[] args) {
        System.out.println("程序开始");
        parseTime("2011-11-11 11:11:11");
        System.out.println("程序结束");
    }

    public static void parseTime(String date) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse(date);
            System.out.println(d);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
