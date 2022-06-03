package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.User;

import java.util.List;

/**
 * @author yy
 */
public interface UserMapper {
    /**
     * 查询所有用户
     * @return 用户集合
     */
    List<User> selectAll();

    /**
     * 根据id查询
     * @param id id
     * @return 用户对象
     */
    User selectById(int id);

    /**
     * 根据用户信息查询
     * @param userName 用户名
     * @param password 密码
     * @param gender 性别
     * @return 对象集合
     */
    List<User> selectAll(@Param("username") String userName, @Param("password") String password, @Param("gender") char gender);
}
