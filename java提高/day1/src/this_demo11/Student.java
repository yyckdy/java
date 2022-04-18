package this_demo11;

public class Student {
    private String name;
    private String schoolName;

    public Student(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    public Student() {
    }

    public Student(String name) {
        this(name,"aaa");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
