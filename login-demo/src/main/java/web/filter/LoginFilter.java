package web.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 登陆验证过滤器
 *
 * @author yy
 */
@WebFilter("/*")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig config) {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        //判断资源路径是否和登陆注册相关
        String[] urls = {"login.jsp", "/imgs/", "/loginServlet", "/register.jsp", "/registerServlet", "/checkCodeServlet"};
        //获取当前访问的资源路径
        HttpServletRequest req = (HttpServletRequest) request;
        String url = req.getRequestURL().toString();
        //循环判断
        for (String u : urls) {
            if (url.contains(u)) {
                //放行
                chain.doFilter(request, response);
                return;
            }
        }

        HttpSession session = req.getSession();
        Object user = session.getAttribute("user");
        //判断user是否为null
        if (user != null) {
            //登陆过
            //放行
            chain.doFilter(request, response);
        } else {
            //没有登陆,存储提示信息,拦截跳转到登陆界面
            req.setAttribute("login_msg", "您尚未登陆");
            req.getRequestDispatcher("login.jsp").forward(req, response);
        }
    }
}
