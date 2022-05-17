package proxy2;

public class UserServiceImpl implements UserService {

    @Override
    public String login(String loginName, String password) {
        String rs = "name or password is wrong!";
        if ("admin".equals(loginName) && "123456".equals(password)) {
            rs = "登陆成功";
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        return rs;
    }

    @Override
    public void deleteUsers() {
        try {
            System.out.println("您正在删除用户数据");
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
    }

    @Override
    public String selectUsers() {
        String rs = "查询了10000个用户数据";
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        return rs;
    }
}
