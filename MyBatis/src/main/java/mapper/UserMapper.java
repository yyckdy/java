package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();

    User selectById(int id);

    List<User> selectAll(@Param("username") String userName, @Param("password") String password, @Param("gender") char gender);
}
