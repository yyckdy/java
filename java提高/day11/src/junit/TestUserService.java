package junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestUserService {
    /*
    测试方法
     */
    @Before
    public void before(){
        System.out.println("======before test======");
    }

    @Test
    public void testLoginName() {//公开无参无返回值方法
        UserService userService = new UserService();
        String rs = userService.loginName("admin", "123456");
        //断言
        Assert.assertEquals("测试失败", "登陆成功", rs);
    }

    @After
    public void after(){
        System.out.println("======after test======");
    }


    @Test
    public void testSelectNames() {
        UserService userService = new UserService();
        userService.selectNames();
    }
}
