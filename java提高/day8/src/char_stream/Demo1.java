package char_stream;

import java.io.FileReader;
import java.io.Reader;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        //创建字符输入流管道与源文件接通
        Reader fr = new FileReader("/Users/yy/IdeaProjects/java/java提高/day8/src/data01.txt");
        //读取一个字符
//        int code=fr.read();
//        System.out.println((char) code);
        int code;
        while((code=fr.read())!=-1){
            System.out.println((char)code);
        }
    }
}
