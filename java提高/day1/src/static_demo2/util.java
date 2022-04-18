package static_demo2;

import java.util.Random;

public class util {
    //私有工具类的构造器
    private util() {

    }

    public static String createCode() {
        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSYUVWXYZ0123456789";
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }
        return code;
    }
}
