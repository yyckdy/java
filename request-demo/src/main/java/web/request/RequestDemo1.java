package web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/req1")
public class RequestDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求方式 GET
        String method = req.getMethod();
        System.out.println(method);

        //获取虚拟目录（项目访问路径）
        String contextPath = req.getContextPath();
        System.out.println(contextPath);

        //获取URL
        StringBuffer url = req.getRequestURL();
        System.out.println(url);

        //获取URI
        String uri = req.getRequestURI();
        System.out.println(uri);

        //获取请求参数
        String queryString = req.getQueryString();
        System.out.println(queryString);

        //获取请求头
        String agent = req.getHeader("user-agent");//浏览器版本信息
        System.out.println(agent);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取post请求体
        BufferedReader br = req.getReader();
        //读取数据
        String line = br.readLine();
        System.out.println(line);
    }
}
