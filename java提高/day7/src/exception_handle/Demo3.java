package exception_handle;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * try ...catch 结合throws在外层处理
 */
public class Demo3 {
    public static void main(String[] args) {
        System.out.println("程序开始");
        try {
            parseTime("2011-11-11 11:11:11");
        } catch (Exception e) {
            System.out.println("操作失败");
        }
        System.out.println("程序结束");
    }

    public static void parseTime(String date) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(date);
        System.out.println(d);

    }
}
