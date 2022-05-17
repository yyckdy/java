package string;

public class StringDemo2 {
    public static void main(String[] args) {
        String name="yy";
        System.out.println(name);
        String s2= "666";
        System.out.println(s2);
        char[] a ={'a','b','c'};
        String s3=new String(a);
        System.out.println(s3);

        byte[]bytes={1,34,54,87,55};
        String s4=new String(bytes);
        System.out.println(s4);


        String s5="666";
        System.out.println((s5==s2));
        String s6=new String(a);
        System.out.println((s3==s6));
    }
}
