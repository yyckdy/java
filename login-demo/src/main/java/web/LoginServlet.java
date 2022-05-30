package web;

import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.User;
import util.SqlSessionFactoryUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //1.接收用户名和密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //2.调用Mybatis完成查询
        //获取sqlSessionFactory对象

        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        //获取Session对象
        SqlSession session = sqlSessionFactory.openSession();
        //获取Mapper对象
        UserMapper mapper = session.getMapper(UserMapper.class);
        //调用方法
        User user = mapper.select(username, password);
        //释放资源
        session.close();

        //获取对应的字符输出流
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        if (user != null) {
            //登陆成功
            writer.write("登陆成功");
        } else {
            //登陆失败
            writer.write("登陆失败");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doGet(request, response);
    }
}
