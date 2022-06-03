package web.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author yy
 */
@WebServlet("/axiosServlet")
public class AxiosjaxServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("get...");
        //1.接收请求参数
        String username = request.getParameter("username");
        System.out.println(username);
        //2.响应数据
        PrintWriter writer = response.getWriter();
        writer.write("hello Axios~");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("post...");
        this.doGet(request, response);
    }
}
