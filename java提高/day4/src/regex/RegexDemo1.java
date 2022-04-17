package regex;

public class RegexDemo1 {
    public static void main(String[] args) {
        //校验qq号码，必须全数子，6-20为
//        String qq="48600672";
//        String qq1="48600a672";
//        System.out.println(checkQQ(qq));
//        System.out.println(checkQQ(qq1));
//
//        //正则表达式
//        System.out.println(checkQQ2(qq));
//        System.out.println(checkQQ2(qq1));

        System.out.println("2442ddfss".matches("\\w{6,}"));
        System.out.println("ydhd".matches("\\w{6,}"));

        System.out.println("23df".matches("[a-zA-Z0-9]{4}"));
        System.out.println("23df".matches("[\\w&&[^_]]{4}"));

    }

    public static boolean checkQQ2(String qq) {
        return qq != null && qq.matches("\\d{6,20}");
    }


    public static boolean checkQQ(String qq) {
        //1.判断qq号码长度
        if (qq == null || qq.length() < 6 || qq.length() > 20) {
            return false;
        }
        //判断是否全部是数字
        //251425a87
        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }

}
