package string;

public class StringApiOthersDemo5 {
    public static void main(String[] args) {
        String name = "i love china";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        char[] c = name.toCharArray();
        System.out.println("----------遍历----------");
        for (char value : c) {
            System.out.print(value);
        }
        System.out.println();
        System.out.println("----------遍历----------");
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
        }
        System.out.println();

        String name2 = "java is best";
        String name3 = name2.substring(0, 4);
        System.out.println(name3);

        String name4 = name2.substring(4);
        System.out.println(name4);

        String name5 = name4.replace("be", "ls");
        System.out.println(name5);

        System.out.println(name5.startsWith("is"));

        String name6="aaa,bbb,ccc";
        String[]strings=name6.split(",");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
