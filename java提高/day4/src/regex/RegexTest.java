package regex;

import java.util.Scanner;

/**
 * 检验手机号码，邮箱，电话号码
 */
public class RegexTest {
    public static void main(String[] args) {

    }

    public static void checkPhone() {
        System.out.println("请您输入您的注册手机号码");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String phone = sc.next();
            //判断格式是否正确
            if (phone.matches("\\d{11}")) {
                System.out.println("手机号码格式正确，注册完成");
                return;
            } else {
                System.out.println("格式有误，请重新输入");
            }
        }
    }
}
