import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Properties;

/**
 * Druid 数据库连接池
 */
public class Druid {
    public static void main(String[] args) throws Exception {
        //1.导入jar包

        //2.定义配置文件

        //3.加载配置文件
        Properties properties = new Properties();
        properties.load(Druid.class.getResourceAsStream("druid.properties"));
        //4.获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        //5.获取数据库连接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();

    }
}
