package exception;

public class Demo2 {
    public static void main(String[] args) {
        //运行时异常

        /*数组越界异常*/
        int[] arr = {1, 2, 3};
        System.out.println(arr[2]);
//        System.out.println(arr[3]);
        /*空指针异常*/
        String name = null;
        System.out.println(name);
//        System.out.println(name.length());

        /*类型转换异常*/
        Object o = 23;
//        String s = (String) o;
//        System.out.println(s);

        /*数字操作异常*/
//        int c=10/0;

        /*数字转换异常*/
        String number = "23aabb";
//        Integer it=Integer.valueOf(number);
//        System.out.println(it);

    }
}
