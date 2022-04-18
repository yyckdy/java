package Lambda;

import java.util.Arrays;

public class LambdaTest3 {
    public static void main(String[] args) {
        Integer[] ages = {66, 33, 22, 55, 88};
        Arrays.sort(ages, (o2, o1) -> o1 - o2);
        System.out.println(Arrays.toString(ages));
    }
}
