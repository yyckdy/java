package proxy2;

public interface UserService {
    String login(String loginName, String password);

    void deleteUsers();

    String selectUsers();
}
