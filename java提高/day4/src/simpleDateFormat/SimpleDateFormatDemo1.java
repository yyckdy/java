package simpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);

        //格式化日期对象(指定最终格式化形式）
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss EEE a");
        System.out.println(sdf.format(d));

        System.out.println("---------------------");

        //格式化时间毫秒值
        long time1=System.currentTimeMillis();
        String rs=sdf.format(time1+121*1000);
        System.out.println(rs);

        System.out.println("---------------------");
        //解析时间

    }
}
