package web.request;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String username="张三";

        //1.URL编码
        String encode = URLEncoder.encode(username, "utf-8");
        System.out.println(encode);

        //2.解码
        String decode = URLDecoder.decode(encode, "iso-8859-1");
        String encode1 = URLEncoder.encode(decode, "iso-8859-1");
        String decode1 = URLDecoder.decode(encode1, "utf-8");
        System.out.println(decode1);
        System.out.println(encode1);
    }
}
