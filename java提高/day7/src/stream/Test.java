package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * stream流的便利
 */
public class Test {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰", "张无忌", "周芷若", "赵敏", "张强");
        System.out.println(names);

        //从集合中找到姓张的放到新集合
//        List<String> zhangList = new ArrayList<>();
//        for (String name : names) {
//            if (/*name.charAt(0)=='张'*/name.startsWith("张")) {
//                zhangList.add(name);
//            }
//        }
//        System.out.println(zhangList);
//
//        //找名称长度是3的姓名
//        List<String> zhangThreeList = new ArrayList<>();
//        for (String name : names) {
//            if (name.length() == 3) {
//                zhangThreeList.add(name);
//            }
//        }
//        System.out.println(zhangThreeList);
//        System.out.println("--------------------");

        //使用stream实现
        names.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);
    }
}
