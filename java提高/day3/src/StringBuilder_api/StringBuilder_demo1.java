package StringBuilder_api;

/**
 * StringBuilder操作字符串
 */
public class StringBuilder_demo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();//""
        sb.append("a");//拼接
        sb.append("b");
        sb.append("c");
        sb.append(999.9);
        System.out.println(sb);//重写了toString

        StringBuilder sb1 = new StringBuilder();
        sb1.append("a").append("b").append("c");
        System.out.println(sb1);
        System.out.println(sb1.reverse().reverse().reverse());

        System.out.println(sb1.length());
        //恢复String
        String rs=sb1.toString();
        check(rs);





        //StringBuilder只是拼接字符串的手段
        //最终结果要恢复String
    }

    public static void check(String data){
        System.out.println(data);
    }
}
