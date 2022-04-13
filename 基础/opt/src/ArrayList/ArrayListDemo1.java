package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("java");
        arrayList.add("java");
        arrayList.add(666);
        System.out.println(arrayList.add(999.9));

        System.out.println(arrayList);

        arrayList.add(1,"ArrayList");
        System.out.println(arrayList);


    }
}
