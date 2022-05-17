public class User {
    //成员变量private
    private String name;
    private double height;
    private double salary;

    public User(String name, double height, double salary) {
        this.name = name;
        this.height = height;
        this.salary = salary;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
