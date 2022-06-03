package web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @author yy
 */
@WebServlet(urlPatterns = "/demo2", loadOnStartup = 1)
public class ServletDemo2 implements Servlet {


    /**
     * 初始化方法
     * 1.调用时机:默认servlet被第一次访问时调用
     * * loadOnStartup:
     * 2.调用次数:1
     *
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服务
     * 1.调用时机：每次servlet被访问
     * 2。调用次数 ：多次
     *
     *
     *
     *
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Servlet hello world!");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法
     * 1.调用时机:内存释放或者服务器关闭的时候,Servlet 对象会被销毁
     * 2.调用次数:1
     */
    @Override
    public void destroy() {
        System.out.println("destroy...");
    }
}
