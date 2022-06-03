import java.sql.*;

/**
 * @author yy
 */
public class MyConnection {
    private MyConnection() {
    }

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/test ? useServerPrepStmts=true",
                    "root", "QqWGJJFPXT0618");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Object executeSql(Connection connection, String sql, boolean ret) {
        try {
            if (connection != null) {
                if (ret) {
                    return connection.createStatement().executeQuery(sql);
                } else {
                    return connection.createStatement().execute(sql);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
