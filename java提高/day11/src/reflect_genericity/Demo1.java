package reflect_genericity;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        //绕过编译阶段
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
//        System.out.println(list.getClass());
//        System.out.println(list1.getClass());
//        System.out.println(list.getClass() == list1.getClass());
        ArrayList list2 = list1;
        list2.add(99.99);
        list1.add(100);
        try {
            Class c1 = list1.getClass();
            Method method = c1.getDeclaredMethod("add", Object.class);
            boolean rs = (boolean) method.invoke(list1, "hello world");
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        System.out.println();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
