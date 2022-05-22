import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 登陆案例
 */
public class preparedStatement {
    @Test
    public void login() {
        try (Connection connection = MyConnection.getConnection()) {
            assert connection != null;
            try (Statement statement = connection.createStatement()) {
                String name = "zhangsan";
                String password = "123";
                String sql = "select*from user where name='" + name + "'and password='" + password + "'";
                ResultSet resultSet = statement.executeQuery(sql);
                if (resultSet.next()) {
                    System.out.println("success");
                } else {
                    System.out.println("fall");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * sql注入
     */
    @Test
    public void testLogin_Inject() {
        try (Connection connection = MyConnection.getConnection()) {
            assert connection != null;
            try (Statement statement = connection.createStatement()) {
                String name = "hhhhhhd";
                String password = "'or'1'='1";//sql注入
                String sql = "select*from user where name='" + name + "'and password='" + password + "'";
                System.out.println(sql);
                ResultSet resultSet = statement.executeQuery(sql);
                if (resultSet.next()) {
                    System.out.println("success");
                } else {
                    System.out.println("fall");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 预编译sql
     */
    @Test
    public void preparedStatement() {
        try (Connection connection = MyConnection.getConnection()) {
            String sql = "select* from user where name=?and password=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            String name = "zhangsan";
            String password = "123";
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                System.out.println("success");
            } else {
                System.out.println("fall");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * preparedStatement原理
     */
    @Test
    public void preparedStatement2() {
        try (Connection connection = MyConnection.getConnection()) {
            String sql = "select* from user where name=?and password=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            String name = "zhangsan";
            String password = "123";
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                System.out.println("success");
            } else {
                System.out.println("fall");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
