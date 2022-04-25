package serializable;

import java.io.*;

/**
 * 对象序列化
 */
public class ObjectOutputDemo1 {
    public static void main(String[] args) throws Exception {
        Student s = new Student("yy", "yy", "1314520", 21);

        //对象序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("java/java提高/day9/src/obj.txt"));
        oos.writeObject(s);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("java/java提高/day9/src/obj.txt"));
        Student s1 = (Student) ois.readObject();
        System.out.println(s1);
        ois.close();

    }
}
