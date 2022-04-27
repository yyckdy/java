package commons_io;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        IOUtils.copy(new FileInputStream("/Users/yy/Desktop/test"), new FileOutputStream("/Users/yy/Desktop/test01"));
    }
}
