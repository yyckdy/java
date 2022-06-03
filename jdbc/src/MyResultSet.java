import java.sql.Connection;
import java.sql.ResultSet;


/**
 * @author yy
 */
public class MyResultSet {
    public static void main(String[] args) {
        try (Connection connection = MyConnection.getConnection()) {
            String sql = "select*from Student";
            ResultSet resultSet = (ResultSet) MyConnection.executeSql(connection, sql, true);
            while (true) {
                assert resultSet != null;
                if (!resultSet.next()) {
                    break;
                }
                System.out.println(resultSet.getString("id") + "==>" + resultSet.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
