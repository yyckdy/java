package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Collection常用api
 */
public class Collection_api {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("hello world");//添加
        System.out.println(list);

        list.clear();//清空

        System.out.println(list.isEmpty());//判空

        list.add("hello");
        list.add("world");
        System.out.println(list.size());//集合大小

        System.out.println(list.contains("hello"));//判断元素的存在

        System.out.println(list);
//        list.remove("hello");//删除
        list.removeIf(Predicate.isEqual("hello"));//删除
        System.out.println(list);

        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));

        System.out.println("------------");
        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        Collection<String> c2 = new ArrayList<>();
        c2.add("c++1");
        c2.add("c++2");
        c1.addAll(c2);//把c2的元素全部拷贝到c1

        System.out.println(c1);

    }
}
