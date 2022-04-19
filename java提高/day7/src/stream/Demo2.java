package stream;

import java.util.*;
import java.util.stream.Stream;

public class Demo2 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        Stream<String> s = list.stream();

        Map<String, Integer> maps = new HashMap<>();
        //键流
        Stream<String> ketStream = maps.keySet().stream();
        //值流
        Stream<Integer> valueStream = maps.values().stream();
        //键值对
        Stream<Map.Entry<String, Integer>> entryStream = maps.entrySet().stream();

        //数组
        String[] names = {"赵敏", "小昭", "灭绝", "周芷若"};
        Stream<String> nameStream = Arrays.stream(names);
        Stream<String> nameStream2 = Stream.of(names);
    }
}
