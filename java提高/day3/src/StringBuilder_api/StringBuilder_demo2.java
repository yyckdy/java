package StringBuilder_api;

public class StringBuilder_demo2 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        printArr(arr);
    }
    public static void printArr(int[]nums){
        StringBuilder sb=new StringBuilder("该数组内容为：[");
        for (int i = 0; i < nums.length-1; i++) {
            sb.append(nums[i]).append(",");
        }
        sb.append(nums[nums.length-1]).append("]");
        System.out.println(sb.toString());
    }
}
