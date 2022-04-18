package this_demo11;

public class Test {
    public static void main(String[] args) {
        //this()的作用
        Student s1=new Student("name_1","school_1");
        System.out.println(s1.getName());
        System.out.println(s1.getSchoolName());
        Student s2=new Student("name_2");
        System.out.println(s2.getName());
        System.out.println(s2.getSchoolName());
    }
}
