package web.cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet("/aServlet")
public class AServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //发送cookie
        //1.创建cookie对象
//        Cookie cookie = new Cookie("username", "zs");
        String value = "张三";
        value = URLEncoder.encode(value, "utf-8");
        Cookie cookie = new Cookie("username", value);
        //2.设置存活时间
        cookie.setMaxAge(3600 * 7 * 24);
        response.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
