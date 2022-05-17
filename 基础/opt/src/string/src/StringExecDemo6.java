package string;

import java.util.Random;

public class StringExecDemo6 {
    public static void main(String[] args) {
        String datas="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String code="";
        Random random=new Random();
        for(int i=0;i<5;i++){
            //随机索引
            int index=random.nextInt(datas.length());
            code+=datas.charAt(index);
        }
        System.out.print(code);
    }
}
