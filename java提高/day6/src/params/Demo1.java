package params;

import java.util.Arrays;

/**
 * 可变参数
 */
public class Demo1 {
    public static void main(String[] args) {
        sum();
        sum(10);
        sum(10, 20);
        sum(10, 20, 30);
        sum(new int[]{10, 20, 30, 40});
    }

    /**
     * 形参列表只能又一个可变参数
     *
     * @param nums
     */
    public static void sum(int... nums) {
        //在内部是数组
        System.out.printf("元素个数->%d\n", nums.length);
        System.out.printf("元素内容->%s\n", Arrays.toString(nums));
    }
}
