package web;

import pojo.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @author yy
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    final String isRemember = "1";
    private final UserService service = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = service.login(username, password);
        if (user != null) {
            //登陆成功 跳转 重定向

            //获取复选框数据
            String remember = request.getParameter("remember");
            //判断用户是否勾选
            if (isRemember.equals(remember)) {
                //发送cookie
                //创建Cookie对象
                Cookie cUsername = new Cookie("username", username);
                Cookie cPassword = new Cookie("password", password);
                //设置cookie存活时间
                cUsername.setMaxAge(3600 * 24 * 7);
                cPassword.setMaxAge(3600 * 24 * 7);
                //发送cookie
                response.addCookie(cPassword);
                response.addCookie(cPassword);
            }

            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            String contextPath = request.getContextPath();
            response.sendRedirect(contextPath + "/selectAllServlet");
        } else {
            //登陆失败 跳转回去
            //存储错误信息到request
            request.setAttribute("login_msg", "用户名或密码错误");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        this.doGet(request, response);
    }
}
