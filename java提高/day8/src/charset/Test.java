package charset;

import java.util.Arrays;

/**
 * 文字编码和解码
 */
public class Test {
    public static void main(String[] args) throws Exception{
        //把文字转换为字节
        String name = "abcd";
            byte[] bytes = name.getBytes("GBK");//以当前代码默认字符集编码<UTF-8>
            System.out.println(Arrays.toString(bytes));
            System.out.println(bytes.length);
        //解码 字节转换为中文形式 编码前后字符集必须一致
        String rs=new String(bytes,"GBK");
        System.out.println(rs);

    }
}
