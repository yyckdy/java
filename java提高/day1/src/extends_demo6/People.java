package extends_demo6;

public class People {
    private String name;
    private int age;

    public void queryCourse(){
        System.out.println(name+" is querying the course");
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
}
