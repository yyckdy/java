package Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日历 可变时间对象
 */
public class CalendarDemo1 {
    public static void main(String[] args) {
        //拿到此刻日历对象
        Calendar cal = Calendar.getInstance();

        //获取日历信息 public int get(int filed)
        System.out.println(cal);
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);
        int month = cal.get(Calendar.MONTH) + 1;
        System.out.println(month);
        int day = cal.get(Calendar.DATE);
        System.out.printf("%d\n", day);

        //修改日历
       /* cal.set(Calendar.HOUR,12);
        System.out.println(cal);*/
        cal.add(Calendar.DATE, 5);
        System.out.println(cal.get(Calendar.DATE));

        //拿到日期对象
        Date d = cal.getTime();
        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(d));

        //获取时间毫秒值
        System.out.println(cal.getTimeInMillis());
    }
}
