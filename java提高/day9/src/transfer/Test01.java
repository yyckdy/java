package transfer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

/**
 * 不同编码报错
 */
public class Test01 {
    public static void main(String[] args) {
        try (
                Reader rd = new FileReader("/Users/yy/Documents/未命名文件夹/test.txt");
                BufferedReader bufferedReader=new BufferedReader(rd);
        ) {
            String line;
            while((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
