package string;

import java.util.Scanner;

public class StringExecDemo7 {
    public static void main(String[] args) {
        String okName="yy";
        String okPassWord="122232";
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<3;i++){
            String name=scanner.next();
            String passWord=scanner.next();
            if(name.equals(okName)){
                if(passWord.equals(okPassWord)){
                    System.out.println("登陆成功");
                    break;
                }
            }
        }
    }
}
