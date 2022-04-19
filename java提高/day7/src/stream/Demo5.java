package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Stream收集流
 */
public class Demo5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");
        Stream<String> s = list.stream().filter(e -> e.startsWith("张"));
        List<String> zhangList = s.collect(Collectors.toList());
        //Stream只能使用一次
        System.out.println(zhangList);
        Stream<String> s1 = list.stream().filter(e -> e.startsWith("张"));
        String[] arr = s1.toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
