package Collection_Traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * 迭代器
 */
public class demo1 {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(20);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {//遍历
            System.out.println(it.next());
        }
        it = list.iterator();
        System.out.println("--------------------");

        list.forEach(integer -> System.out.println(integer * 10));
        System.out.println("--------------------");
        for (Integer val : list) {
            System.out.println(val);
        }

        System.out.println("--------------------");
        list.forEach(System.out::println);
    }
}
