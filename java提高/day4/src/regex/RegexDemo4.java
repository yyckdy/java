package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {
    public static void main(String[] args) {
        String rs = "kdkksj,19936081164,ddjjj,48600672@qq.com,400-123-1234,16623131784";
        //规则
        String regex = "(\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2})|(1[3-9]\\d{9})|(400-?[0-9]{3,10}-?[0-9]{3,10})";
        //把规则编译为匹配对象
        Pattern pattern = Pattern.compile(regex);

        //得到一个内容匹配器对象
        Matcher matcher = pattern.matcher(rs);

        while(matcher.find()){
            String rs1=matcher.group();
            System.out.println(rs1);
        }
    }

}
