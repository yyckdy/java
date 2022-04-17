package simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        //使用SimpleDateFormat解析时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String dateStr = "2021年08月06日 11:11:11";
        Date d = sdf.parse(dateStr);
        long time = d.getTime() + (2L * 24 * 3600 + 14 * 3600 + 49 * 60) * 1000;
        //解析为日期对象
        System.out.println(sdf.format(time));

    }
}
