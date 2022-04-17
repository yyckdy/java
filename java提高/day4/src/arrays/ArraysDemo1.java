package arrays;

import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        //Arrays常用api
        int[] arr = {10, 2, 55, 23, 24, 100};
        Arrays.sort(arr);
        String rs = Arrays.toString(arr);
        System.out.println(rs);

        //二分查找  查找有序数组
        System.out.println(Arrays.binarySearch(arr, 55));
    }
}
