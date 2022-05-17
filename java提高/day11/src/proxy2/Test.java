package proxy2;

/**
 * 动态代理解决问题
 */
public class Test {
    public static void main(String[] args) {
        UserService userService = ProxyUtil.getProxy(new UserServiceImpl());
        System.out.println(userService.login("admin", "123456"));
        System.out.println(userService.selectUsers());
        userService.deleteUsers();
    }
}
