package example;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;
import project.Brand;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author yy
 */
public class BrandTest {
    /**
     * 查询所有
     * 结果list<Brand>
     */
    @Test
    public void testSelectAll() throws Exception {
        List<Brand> brandList = new ArrayList<>();
        Properties properties = new Properties();
        properties.load(new FileInputStream("/Users/yy/IdeaProjects/javaweb/jdbc/src/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();
        String sql = "select *from tb_brand";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            //获取数据 封装对象
            int id = resultSet.getInt("id");
            String brandName = resultSet.getString("brand_name");
            String companyName = resultSet.getString("company_name");
            int ordered = resultSet.getInt("ordered");
            String description = resultSet.getString("description");
            int status = resultSet.getInt("status");
            brandList.add(new Brand(id, brandName, companyName, ordered, description, status));
        }
        for (Brand brand : brandList) {
            System.out.println(brand);
        }
        //7.释放资源
        resultSet.close();
        connection.close();
        preparedStatement.close();
    }

    /**
     * 添加
     */
    @Test
    public void testAdd() throws Exception {
        //接收页面提交的参数
        String brandName = "香飘飘";
        String companyName = "香飘飘";
        int ordered = 1;
        String description = "绕地球一圈";
        int status = 1;
        Properties properties = new Properties();
        properties.load(new FileInputStream("/Users/yy/IdeaProjects/javaweb/jdbc/src/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();
        String sql = "insert into tb_brand(brand_name, company_name, ordered, description, status) values (?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, brandName);
        preparedStatement.setString(2, companyName);
        preparedStatement.setInt(3, ordered);
        preparedStatement.setString(4, description);
        preparedStatement.setInt(5, status);
        //执行sql
        int count = preparedStatement.executeUpdate();
        //处理结果
        System.out.println(count > 0);
        //7.释放资源
        connection.close();
        preparedStatement.close();
    }

    /**
     * 修改
     */
    @Test
    public void testUpdate() throws Exception {
        //接收页面提交的参数
        String brandName = "香飘飘";
        String companyName = "香飘飘";
        int ordered = 1000;
        String description = "绕地球三圈";
        int status = 1;
        int id = 4;
        Properties properties = new Properties();
        properties.load(new FileInputStream("/Users/yy/IdeaProjects/javaweb/jdbc/src/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();
        String sql = "update tb_brand set brand_name=?,company_name=?,ordered=?,description=?,status=? where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, brandName);
        preparedStatement.setString(2, companyName);
        preparedStatement.setInt(3, ordered);
        preparedStatement.setString(4, description);
        preparedStatement.setInt(5, status);
        preparedStatement.setInt(6, id);
        //执行sql
        int count = preparedStatement.executeUpdate();
        //处理结果
        System.out.println(count > 0);
        //7.释放资源
        connection.close();
        preparedStatement.close();
    }

    @Test
    public void testDelete() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("/Users/yy/IdeaProjects/javaweb/jdbc/src/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();
        String sql = "delete from tb_brand where id =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, 1);
        int count = preparedStatement.executeUpdate();
        System.out.println(count > 0);
    }

}
