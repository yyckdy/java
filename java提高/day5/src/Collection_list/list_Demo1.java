package Collection_list;

import java.util.ArrayList;
import java.util.List;

public class list_Demo1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("java");
        list.add("java");
        list.add("MySQL");
        list.add("MySQL");
        list.add("MySQL");
        list.add(2,"HTML");
        System.out.println(list);
        System.out.println(list.remove(2));
        System.out.println(list.get(2));
        list.set(1,"c++");
        System.out.println(list);
    }
}
