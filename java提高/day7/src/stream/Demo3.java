package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");
        list.stream().filter(s -> s.startsWith("张")).forEach(System.out::println);

        System.out.println(list.stream().filter(s -> s.length() == 3).count());//计数

        list.stream().filter(s -> s.startsWith("张")).limit(2).forEach(System.out::println);//取前两个

        list.stream().filter(s -> s.startsWith("张")).skip(2).forEach(System.out::println);//跳过前两个

        //Map加工方法
        list.stream().map(s -> "黑马的" + s).forEach(System.out::println);//第一个参数原材料 ，第二个加工后的

        //把所以的名称加工为学生对象
        list.stream().map(Student::new).forEach(System.out::println);//构造器引用

        //合并流
        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        Stream<String> s2 = Stream.of("java1", "java2");
        Stream<Object> s3 = Stream.concat(s1, s2);//可以合并子类流 可以合并两个不同流
        s3.distinct().forEach(System.out::println);
       /*
       Stream流无法修改集合元素
        */

    }
}
