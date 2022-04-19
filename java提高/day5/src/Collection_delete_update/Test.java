package Collection_delete_update;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("黑马");
        list.add("Java");
        list.add("Java");
        list.add("赵敏");
        list.add("赵敏");
        list.add("素素");
        System.out.println(list);

//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            String ele = it.next();
//            if (ele.equals("Java")) {
////                list.remove("Java");
//                it.remove();//删除当前所在元素
//            }
//        }
//        System.out.println(list);


    }
}
