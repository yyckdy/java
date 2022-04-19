package unchange_collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
不可变集合
 */
public class Demo1 {
    public static void main(String[] args) {
        List<Double> list = List.of(569.5, 700.5, 523.5, 570.4);//不可变list
        Set<String> names = Set.of("yy", "cw", "wtt");//不可变set
        Map<String, Integer>maps=Map.of("iPhone",2,"java",1,"手表",1);
        System.out.println(list);
        System.out.println(names);
        System.out.println(maps);
    }
}
