package web;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class MyHttpServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        // 根据请求方式的不同分别处理

        //1.获取请求方式
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String method = request.getMethod();

        //2.判断请求方式

        if ("GET".equals(method)) {
            //get方式的处理逻辑
            doGet(servletRequest, servletResponse);
        } else if ("POST".equals(method)) {
            //post方式处理逻辑
            doPost(servletRequest, servletResponse);
        }

    }

    protected void doPost(ServletRequest servletRequest, ServletResponse servletResponse) {
    }

    protected void doGet(ServletRequest servletRequest, ServletResponse servletResponse) {
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
