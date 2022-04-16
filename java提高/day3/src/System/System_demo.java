package System;

import java.util.Arrays;

public class System_demo {
    public static void main(String[] args) {
        //时间 返回1970-1-1 00：00：00到现在的毫秒值
       /* long time=System.currentTimeMillis();
        for(int i=0;i<100000;i++)
        {
            System.out.println(i);
        }
        long times1=System.currentTimeMillis();
        long res=times1-time;
        System.out.println(res/1000.0);*/

        //数组拷贝
        int[] arr1 = {10, 20, 30, 40, 50, 60, 70};
        int[] arr2 = new int[6];
        System.arraycopy(arr1,0,arr2,0,6);
        System.out.println(Arrays.toString(arr2));
    }
}
