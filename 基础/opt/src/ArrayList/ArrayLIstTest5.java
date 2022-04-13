package ArrayList;

import java.util.ArrayList;

public class ArrayLIstTest5 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("20180302", "aaa", 23, "1"));
        students.add(new Student("20180303", "bbb", 23, "2"));
        students.add(new Student("20180304", "ccc", 26, "3"));
        students.add(new Student("20180305", "ddd", 26, "4"));

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.print(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getClassName());
            System.out.println();
        }

        System.out.println("-------------");

        Student student = getStudentById(students, "20180305");
        System.out.print(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getClassName());


    }

    /**
     * 根据学号查询并返回
     *
     * @param students 存储全体学生的集合
     * @param id       学号
     * @return 学生对象或null
     */

    public static Student getStudentById(ArrayList<Student> students, String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }
}
