package set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet特性
 */
public class Demo4 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(23);
        set.add(24);
        set.add(12);
        set.add(8);
        System.out.println(set);
        Set<String> set1 = new TreeSet<>();
        set1.add("Java");
        set1.add("Java");
        set1.add("angle");
        set1.add("黑马");
        set1.add("About");
        set1.add("Python");
        set1.add("UI");
        set1.add("UI");
        System.out.println(set1);
        System.out.println("--------------------");
        Student s1 = new Student("yy", 19, '男');
        Student s2 = new Student("cw", 20, '男');
        Student s3 = new Student("wtt", 16, '男');
        Set<Student> set2 = new TreeSet<>(((o1, o2) -> o2.getAge() - o1.getAge()));
        set2.add(s1);
        set2.add(s2);
        set2.add(s3);
        System.out.println(set2);
    }
}

