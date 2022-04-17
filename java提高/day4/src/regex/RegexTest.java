package regex;

import java.util.Scanner;

/**
 * 检验手机号码，邮箱，电话号码
 */
public class RegexTest {
    public static void main(String[] args) {
//        checkPhone();
//        checkEmail();
    }

    public static void checkEmail() {
        System.out.println("请您输入您的注册邮箱");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String email = sc.next();
            //判断格式是否正确
            //48600672@qq.com
            //48600672@163.com
            //48600672yy@pci.com.cn
            if (email.matches("\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}")) {
                System.out.println("邮箱格式正确，注册完成");
                return;
            } else {
                System.out.println("格式有误，请重新输入");
            }
        }
    }

    public static void checkPhone() {
        System.out.println("请您输入您的注册手机号码");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String phone = sc.next();
            //判断格式是否正确
            if (phone.matches("1[3-9]\\d{9}")) {
                System.out.println("手机号码格式正确，注册完成");
                return;
            } else {
                System.out.println("格式有误，请重新输入");
            }
        }
    }
}
