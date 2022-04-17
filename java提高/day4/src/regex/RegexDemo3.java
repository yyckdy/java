package regex;

public class RegexDemo3 {
    public static void main(String[] args) {
        String names = "小路hhfhhhsh小明hshdhhh李华";
        String[] arr = names.split("\\w+");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s\n", arr[i]);
        }
        String name2 = names.replaceAll("\\w+", " ");
        System.out.printf("%s\n", name2);
    }
}
