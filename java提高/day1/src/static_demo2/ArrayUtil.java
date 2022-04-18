package static_demo2;

public final class ArrayUtil {
    private ArrayUtil(){};

    public static String toString(int[]arr){
        if(arr==null){
            return null;
        }

        //拼接内容
        String res="[";
        for (int i = 0; i < arr.length; i++) {
            res+=(i==arr.length-1?arr[i]:arr[i]+",");
        }
        res+="]";
        return res;
    }
}
