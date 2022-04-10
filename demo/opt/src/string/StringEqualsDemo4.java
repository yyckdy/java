package string;

import java.util.Scanner;

public class StringEqualsDemo4 {
    public static void main(String[] args) {

        String okName="yy";
        String okPassWord="ok";

        //输入
        Scanner scanner=new Scanner(System.in);
        System.out.println("登陆名称");
        String name=scanner.next();
        String passWord=scanner.next();

        //判断
        //equals    比较内容
        //equalsIgnoreCase  忽略大小写比较内容 比较验证码
        if(name.equalsIgnoreCase(okName)&&passWord.equalsIgnoreCase(okPassWord)){
            System.out.println("登陆成功");
            }
        else {
            System.out.println("错误");
        }
    }
}
