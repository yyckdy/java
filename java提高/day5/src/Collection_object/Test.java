package Collection_object;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Movie m1 = new Movie("movie1", 9.9, "actor1");
        Movie m2 = new Movie("movie2", 9.8, "actor2");
        Movie m3 = new Movie("movie3", 9.6, "actor3");

        Collection<Movie> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);

        list.forEach(movie -> {//遍历1
            System.out.println(movie.toString());
        });
        System.out.println("---------------------");
        Iterator<Movie> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
        System.out.println("---------------------");
        for (Movie m : list) {
            System.out.println(m.toString());
        }
    }
}
