package char_stream;

import java.io.*;

public class WriterDemo3 {
    public static void main(String[] args) throws Exception {
        try (
                Writer writer = new FileWriter("/Users/yy/IdeaProjects/java/java提高/day8/src/data.txt", false);
                Reader reader = new FileReader("/Users/yy/IdeaProjects/java/java提高/day8/src/data01.txt");
        ) {
            char[] buffer = new char[1024];
            int len;
            while ((len = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, len);
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
