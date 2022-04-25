package char_buffer;

import java.io.*;

/**
 * 缓冲字符输入流
 */
public class Demo1 {
    public static void main(String[] args) throws Exception {
        try (
                Writer writer = new FileWriter("/Users/yy/IdeaProjects/java/java提高/day9/src/out03.txt", false);
                //
                BufferedWriter bufferedWriter=new BufferedWriter(writer);
                Reader reader = new FileReader("/Users/yy/IdeaProjects/java/java提高/day8/src/data01.txt");
                //包装成缓冲字符输入流
                BufferedReader bufferedReader=new BufferedReader(reader);
        ) {
            String line;
            while ((line=bufferedReader.readLine())!=null){
                bufferedWriter.write(line+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
