package byte_stream;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/**
 * 向文件写入数据
 */
public class OutputStreamDemo3 {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("java/java提高/day8/src/data01.txt", false/*追加数据*/);//先清空之前的数据 覆盖管道
        //写一个字节出去
//        os.write('a');
//        os.write('b');
//        os.write('c');
        byte[] buffer = "中国\n".getBytes(StandardCharsets.UTF_8);
        os.write(buffer);

        //刷新数据
        os.flush();
        os.close();//释放资源(包含刷新)

    }
}
