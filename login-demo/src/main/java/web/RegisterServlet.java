package web;

import pojo.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yy
 */
@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
    private final UserService service = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //获取用户名和密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //封装user对象
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        //用户注册
        boolean flag = service.register(user);
        //判断注册是否成功
        if (flag) {
            //注册成功 跳转登陆页面
            request.setAttribute("register_msg", "注册成功请登陆");
            //转发
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        } else {
            //注册失败 跳转到注册页面
            request.setAttribute("register_msg", "用户名存在");
            request.getRequestDispatcher("/register.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        this.doGet(request, response);
    }
}
