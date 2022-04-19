package geneticity_method;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        String[] names = {"小路", "蓉蓉", "小何"};
        printArray(names);
        Integer[] ages = {10, 20, 30};
        printArray(ages);
        Integer[] ages2 = getArr(ages);
        System.out.println(Arrays.toString(ages2));
    }

    public static <T> void printArray(T[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static <T> T[] getArr(T[] arr) {
        return arr;
    }
}
