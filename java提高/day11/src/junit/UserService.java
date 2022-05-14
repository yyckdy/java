package junit;

public class UserService {
    public String loginName(String loginName, String password) {
        if ("admin".equals(loginName) && "123456".equals(password)) {
            return "登陆成功";
        } else {
            return "用户名或密码有问题";
        }
    }

    public void selectNames() {
        System.out.println(10 / 0);
        System.out.println("查询全部用户名成功");
    }
}

