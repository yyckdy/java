package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Brand;

import java.util.List;
import java.util.Map;

/**
 * @author yy
 */
public interface BrandMapper {
    /**
     * 查看所有
     *
     * @return 结果集
     */
    List<Brand> selectAll();

    /**
     * 根据id查询用户
     * @param id 用户id
     * @return brand
     */
    Brand selectById(int id);


    /**
     * @param status      status
     * @param companyName companyName
     * @param brandName   brandName
     * @return 结果集
     */

    /**
     * 根据条件查询
     * @param status 状态码
     * @param companyName 公司名
     * @param brandName 产品名
     * @return brand列表
     */
    List<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String companyName, @Param("brandName") String brandName);

    /**
     * 按条件查询
     * @param brand Brand对象
     * @return 结果集
     */
    List<Brand> selectByCondition(Brand brand);

    /**
     * 根据map对象查询
     * @param map Map对象
     * @return 结果集
     */
    List<Brand> selectByCondition(Map map);

    /**
     * 单条件查询
     *
     * @param brand Brand对象
     * @return 结果集合
     */
    List<Brand> selectByConditionSingle(Brand brand);

    /**
     * 添加
     *
     * @param brand Brand对象
     */
    void add(Brand brand);

    /**
     * 修改
     *
     * @param brand Brand对象
     * @return 受到影响的行数
     */
    int update(Brand brand);

    /**
     * 根据id删除
     * @param id 用户id
     */
    void deleteById(int id);

    /**
     * 批量删除
     *
     * @param ids id数组
     */
    void deleteByIds(@Param("ids") int[] ids);
}
