package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections基础api
 */
public class Demo1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
//        names.add("楚留香");
//        names.add("胡铁花");
//        names.add("张无忌");
//        names.add("陆小凤");
        Collections.addAll(names, "楚留香", "胡铁花", "张无忌", "陆小凤");//批量添加
        System.out.println(names);
        Collections.shuffle(names);//打乱list集合顺序
        System.out.println(names);

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 12, 23, 2, 4);
        System.out.println(list);
        Collections.sort(list, (o1, o2) -> o2 - o1);
        System.out.println(list);

        List<Student> list1 = new ArrayList<>();
        Collections.addAll(list1, new Student("yy", 23, '男'), new Student("cw", 34, '男'), new Student("wtt", 25, '男'));
        list1.sort((o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println(list1);
    }
}
