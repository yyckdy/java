package proxy;

public class Star implements Skill {
    private String name;

    public Star(String name) {
        this.name = name;
    }


    @Override
    public void jump() {
        System.out.println(name + " begin jumping~~~");
    }

    @Override
    public void sing() {
        System.out.println(name + " begin singing~~~");
    }
}
