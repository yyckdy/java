package Collection_list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class list_Demo3 {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.addFirst(10);
        stack.addFirst(20);
        stack.addLast(30);
        stack.addLast(40);
        System.out.println(stack);
        System.out.println(stack.getFirst());
        System.out.println(stack.getLast());
        stack.pop();
        System.out.println(stack);


        stack.add(10);
        stack.push(10);


    }
}
