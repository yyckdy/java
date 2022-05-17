import java.util.ArrayList;

public class ArrayLIstDemo3 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        System.out.println(list);

        System.out.println(list.get(1));
        System.out.println(list.get(3));

        System.out.println(list.size());

        //遍历
        for(String string:list){
            System.out.print(string+" ");
        }
        System.out.println();

        list.remove(2);
        System.out.println(list);
        list.remove("E");//删除第一个
        System.out.println(list);

        list.set(3,"java");
        System.out.println(list);
    }
}
