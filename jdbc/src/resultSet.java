import java.sql.Connection;
import java.sql.ResultSet;


public class resultSet {
    public static void main(String[] args) {
        try (Connection connection = MyConnection.getConnection()) {
            String sql = "select*from Student";
            ResultSet resultSet = (ResultSet) MyConnection.executeSql(connection, sql, true);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("id") + "==>" + resultSet.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
