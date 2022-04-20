package logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 快速搭建logback日志框架记录程序执行情况 到文件中
 */
public class Test {
    //创建logback的日志对象
    public static final Logger LOGGER = LoggerFactory.getLogger("Test.class");

    public static void main(String[] args) {
        while (true) {
            try {
                LOGGER.debug("main方法开始执行");
                LOGGER.info("开始记录第二行日志，开始做除法");
                int a = 10;
                int b = 0;
                LOGGER.trace("a=" + a);
                LOGGER.trace("b=" + b);
                System.out.println(a / b);
            } catch (Exception e) {
                e.printStackTrace();
                LOGGER.error("功能出现异常，"+e);
            }
        }
    }
}
