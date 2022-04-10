package ArrayList;

import java.util.ArrayList;

public class ArrayListTest4 {
    public static void main(String[] args) {
        Movie m1=new Movie("肖生克的救赎",9.7,"罗宾斯");
        Movie m2=new Movie("霸王别姬",9.6,"张国荣");
        Movie m3=new Movie("阿甘正传",9.5,"汤姆");

        ArrayList<Movie>movies=new ArrayList<>();
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);

        for (int i = 0; i < movies.size(); i++) {
            Movie movie=movies.get(i);
            System.out.println("name"+movie.getName()+",score"+movie.getScore()+",actor"+movie.getActor());
        }
    }
}
