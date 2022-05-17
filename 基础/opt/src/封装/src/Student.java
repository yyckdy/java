public class Student {
    private int age;

    public void setAge(int age){
        if(age>=0&&age<=200) {
            this.age = age;
        }
        else{
            return;
        }
    }

    public int getAge(){
        return this.age;
    }
}
