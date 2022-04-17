package simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        //1.开始和结束时间
        String startTime = "2021-11-11 00:00:00";
        String endTime = "2021-11-11 00:10:00";

        //
        String xiaoJia = "2021-11-11 00:03:47";
        String xiaoPi = "2021-11-11 00:10:11";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1 = sdf.parse(startTime);
        Date d2 = sdf.parse(endTime);
        Date d3 = sdf.parse(xiaoJia);
        Date d4 = sdf.parse(xiaoPi);
        if (d3.after(d1) && d3.before(d2)) {
            System.out.println("xiaoJia success");
        } else {
            System.out.println("xiaoJia default");
        }

        if (d4.after(d1) && d4.before(d2)) {
            System.out.println("xiaoPi success");
        } else {
            System.out.println("xiaoPi default");
        }
    }
}
