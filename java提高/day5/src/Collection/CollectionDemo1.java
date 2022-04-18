package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection list=new ArrayList();
        list.add("java");
        list.add("java");
        list.add("java");
        list.add("java");
        list.add("java");
        list.add("java");
        list.add("java");
        System.out.println(list);
        System.out.println("-----------------");
        Collection set=new HashSet();//无序不重复 无索引
        set.add("java");
        set.add("java1");
        set.add("java2");
        set.add("java3");
        set.add("java4");
        set.add("java5");
        System.out.println(set);

        System.out.printf("------------------\n");

        Collection<Integer>list1=new ArrayList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println(list1);

    }
}
