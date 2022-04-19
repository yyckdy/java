package Collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 遍历
 */
public class list_Demo2 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();//基于数组
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(20);
        list.add(70);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------");
        for(Integer i:list){
            System.out.println(i);
        }
        System.out.println("----------");
        Iterator<Integer>it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("----------");
        list.forEach(System.out::println);
    }
}
