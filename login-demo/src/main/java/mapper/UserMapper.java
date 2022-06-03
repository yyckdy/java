package mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import pojo.User;

/**
 * @author yy
 */
public interface UserMapper {

    /**
     * 查询用户
     * @param username 用户名
     * @param password 密码
     * @return 用户对象
     */
    @Select("select * from db1.tb_user where username = #{username} and password = #{password}")
    User select(@Param("username") String username, @Param("password") String password);

    /**
     * 根据用户名查询用户
     * @param username 用户名
     * @return 用户对象
     */
    @Select("select * from db1.tb_user  where username = #{username}")
    User selectByUsername(String username);

    /**
     * 添加用户
     * @param user 用户对象
     */
    @Insert("insert into db1.tb_user values(null,#{username},#{password})")
    void add(User user);
}
