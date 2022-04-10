package interface_implements;

public class PingPongMan implements SportMan,Law{

    private String name;
    public void run(){
        System.out.println(name+" is run");
    }

    public PingPongMan(String name) {
        this.name = name;
    }

    public void competition(){
        System.out.println(name+" is competition");
    }
     public void rule(){
         System.out.println(name+" must obey the rule");
     }
}
