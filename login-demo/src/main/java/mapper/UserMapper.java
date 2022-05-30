package mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import pojo.User;

public interface UserMapper {
    /**
     * 根据用户名和密码查询用户对象
     *
     * @param username 用户名
     * @param password 密码
     * @return 用户对象
     */
    @Select("select *from db1.tb_user where username=#{username} and password=#{password}")
    User select(@Param("username") String username, @Param("password") String password);

    /**
     * 根据用户名查询用户对象
     *
     * @param username 用户名
     * @return 用户对象
     */
    @Select("select *from db1.tb_user where username=#{username}")
    User selectByName(String username);

    /**
     * 插入用户
     *
     * @param username 用户名
     * @param password 密码
     */
    @Insert("insert into db1.tb_user(username,password)values(#{username},#{password})")
    void add(@Param("username") String username, @Param("password") String password);
}
