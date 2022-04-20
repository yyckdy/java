package exception_handle_runtime;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个合法价格");
        while (true) {
            try {
                String priceStr = sc.nextLine();
                double price = Double.valueOf(priceStr);
                if (price > 0) {
                    System.out.println("定价：" + price);
                    break;
                } else {
                    System.out.println("价格必须是正数");
                }
            } catch (NumberFormatException e) {
                System.out.println("数据不合法");
            }
        }
    }
}
