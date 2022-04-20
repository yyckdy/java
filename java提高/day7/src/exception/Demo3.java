package exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo3 {
    public static void main(String[] args) throws ParseException {
        //编译时异常
        String date = "2015-01-12 10:23:21";
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = s.parse(date);
        System.out.println(date1);
    }
}
