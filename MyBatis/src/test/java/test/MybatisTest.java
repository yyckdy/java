package test;

import mapper.BrandMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.Brand;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MybatisTest {
    @Test
    public void testSelectAll() throws Exception {
        //1,获取SqlSessionFactor;
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取Mapper接口代理对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        //4.执行方法
        List<Brand> brands = mapper.selectAll();
        System.out.println(brands);
        //5.释放资源
        sqlSession.close();
    }

    @Test
    public void testSelectById() throws Exception {
        int id = 1;
        //1,获取SqlSessionFactor;
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取Mapper接口代理对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        //4.执行方法
        Brand brand = mapper.selectById(id);
        System.out.println(brand);
        //5.释放资源
        sqlSession.close();
    }

    @Test
    public void selectByCondition() throws Exception {
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";

        //处理参数
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";
        //1,获取SqlSessionFactor;
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取Mapper接口代理对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        //4.执行方法
//        List<Brand> brands = mapper.selectByCondition(status, companyName, brandName);


//        Brand brand = new Brand();
//        brand.setStatus(status);
//        brand.setCompanyName(companyName);
//        brand.setBrandName(brandName);
//        List<Brand> brands = mapper.selectByCondition(brand);

        Map map = new HashMap();
//        map.put("status", status);
        map.put("companyName", companyName);
//        map.put("brandName", brandName);
        List<Brand> brands = mapper.selectByCondition(map);
        System.out.println(brands);
        //5.释放资源
        sqlSession.close();
    }


    @Test
    public void testSelectByConditionSingle() throws Exception {

        int status = 1;
        String companyName = "华为";
        String brandName = "华为";

        //处理参数
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";
        //1,获取SqlSessionFactor;
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取Mapper接口代理对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        //4.执行方法
        Brand brand = new Brand();
//        brand.setStatus(status);
//        brand.setCompanyName(companyName);
//        brand.setBrandName(brandName);
        List<Brand> brands = mapper.selectByConditionSingle(brand);
        System.out.println(brands);
        //5.释放资源
        sqlSession.close();
    }

    @Test
    public void testAdd() throws Exception {
        int status = 1;
        String companyName = "波导手机";
        String brandName = "波导";
        String description = "手机中的战斗机";
        int ordered = 100;
        //获取连接
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);//开启事务
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setBrandName(brandName);
        brand.setDescription(description);
        brand.setOrdered(ordered);

        mapper.add(brand);
        //提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void testAdd2() throws Exception {
        int status = 1;
        String companyName = "波导手机";
        String brandName = "波导";
        String description = "手机中的战斗机";
        int ordered = 100;
        //获取连接
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);//开启事务
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setBrandName(brandName);
        brand.setDescription(description);
        brand.setOrdered(ordered);

        mapper.add(brand);
        System.out.println(brand.getId());
        //提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void testUpdate() throws Exception {
        int status = 0;
        String companyName = "波导手机";
        String brandName = "波导";
        String description = "波导手机,手机中的战斗机";
        int ordered = 200;
        int id = 6;
        //获取连接
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);//开启事务
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        Brand brand = new Brand();
        brand.setStatus(status);
//        brand.setCompanyName(companyName);
//        brand.setBrandName(brandName);
//        brand.setDescription(description);
//        brand.setOrdered(ordered);
        brand.setId(id);

        int count = mapper.update(brand);
        System.out.println(count);
        //提交事务

        sqlSession.close();
    }

    @Test
    public void testDeleteById() throws Exception {
        int id = 6;

        //获取连接
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);//开启事务
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        mapper.deleteById(id);

        sqlSession.close();
    }

    @Test
    public void testDeleteByIds() throws Exception {
        int[] ids = {5, 7, 8};

        //获取连接
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);//开启事务
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        mapper.deleteByIds(ids);

        sqlSession.close();
    }
}
