package innerclass_ststic;

/**
 * 外部类
 */
public class Outer {
    //静态成员内部类

    public static int a = 100;
    public String hobby;

    public static class Inner {
        private String name;
        private int age;
        public static String schoolName;

        public void show() {
            System.out.println(a);
            Outer outer = new Outer();
        }

        public Inner() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public static String getSchoolName() {
            return schoolName;
        }

        public static void setSchoolName(String schoolName) {
            Inner.schoolName = schoolName;
        }

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

}

