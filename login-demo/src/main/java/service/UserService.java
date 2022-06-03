package service;

import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.User;
import util.SqlSessionFactoryUtils;

/**
 * @author yy
 */
public class UserService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    /**
     * 登陆方法
     *
     * @param username 用户名
     * @param password 密码
     * @return 用户对象
     */
    public User login(String username, String password) {
        SqlSession session = factory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.select(username, password);
        session.close();
        return user;
    }

    public boolean register(User user) {
        SqlSession session = factory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User u = mapper.selectByUsername(user.getUsername());
        if (u == null) {
            //用户名不存在 注册
            mapper.add(user);
            session.commit();
        }
        session.close();
        return u == null;
    }
}
