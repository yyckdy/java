package web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author yy
 */
@WebFilter("/*")
public class FilterDemo2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //放行前处理request数据
        System.out.println("2.FilterDemo...");
        //放行
        chain.doFilter(request, response);
        //放行后对response处理
        System.out.println("4.FilterDemo...");
    }

    @Override
    public void destroy() {

    }
}
