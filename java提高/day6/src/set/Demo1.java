package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * set系列集合的特点
 */
public class Demo1 {
    public static void main(String[] args) {
        //HashSet LinkedHashSet TreeSet
//        Set<String> sets = new LinkedHashSet<>();//有序，不重复，无索引
        Set<String> sets = new HashSet<>();//无序，不重复，无索引  根据哈希值,再判断equals
        sets.add("MySQL");
        sets.add("MySQL");
        sets.add("Java");
        sets.add("Java");
        sets.add("HTML");
        sets.add("HTML");
        sets.add("SpringBoot");
        sets.add("SpringBoot");
        System.out.println(sets);
        System.out.println("-------------------");
    }
}
