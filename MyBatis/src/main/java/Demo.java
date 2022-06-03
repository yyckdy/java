import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * mybatis入门
 * @author yy
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        //1.加载配置文件获取对象SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取SqlSession对象执行sql
        SqlSession session = sqlSessionFactory.openSession();

        //3.执行sql
        List<User> users = session.selectList("test.selectAll");
        System.out.println(users);
        session.close();
    }
}
