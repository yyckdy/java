package mapper;

import org.apache.ibatis.annotations.*;
import pojo.Brand;

import java.util.List;

/**
 * @author yy
 */
public interface BrandMapper {
    /**
     * 查询所有brand
     * @return brand集合
     */
    @Select("select *from tb_brand")
    @ResultMap("brandResultMap")
    List<Brand> selectAll();

    /**
     * 添加brand
     * @param brand Brand对象
     */
    @Insert("insert into tb_brand values (null,#{brandName},#{companyName},#{ordered},#{description},#{status})")
    void add(Brand brand);

    /**
     * 根据id查找
     * @param id id
     * @return
     */
    @Select("select *from tb_brand where id =#{id}")
    @ResultMap("brandResultMap")
    Brand selectById(int id);

    /**
     * 修改
     * @param brand Brand对象
     */
    @Update("update tb_brand set brand_name=#{brandName},company_name=#{companyName},ordered=#{ordered},description=#{description},status=#{status} where id=#{id}")
    @ResultMap("brandResultMap")
    void update(Brand brand);

    /**
     * 根据id删除
     * @param id id
     */
    @Delete("delete from tb_brand where id=#{id}")
    void delete(int id);
}
