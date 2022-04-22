package char_stream;

import java.io.FileReader;
import java.io.Reader;

public class Demo2 {
    public static void main(String[] args) throws Exception {
        //创建字符输入流管道与源文件接通
        Reader fr = new FileReader("/Users/yy/IdeaProjects/java/java提高/day8/src/data01.txt");
        char[] buffer = new char[1024];
        int len;
        while((len=fr.read(buffer))!=-1){
            String rs=new String(buffer,0,len);
            System.out.print(rs);
        }
    }
}
