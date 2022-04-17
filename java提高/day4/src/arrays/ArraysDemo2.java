package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {
    public static void main(String[] args) {
        //自定义数组排序规则 Comparator
        Integer[] nums = {24, 13, 54, 87};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 < o2 ? 1 : -1;
            }
        });
        System.out.println(Arrays.toString(nums));
        System.out.println("--------------------");

        Student[]students =new Student[4];
        students[0]=new Student(11,"aaa",191.1);
        students[1]=new Student(14,"bbb",199.1);
        students[2]=new Student(16,"ccc",190.1);
        students[3]=new Student(9,"ddd",181.1);
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getHeight(),o2.getHeight());
            }
        });
        System.out.println(Arrays.toString(students));
    }
}
