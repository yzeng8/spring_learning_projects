package com.yonyou.mapper;

import com.yonyou.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BrandMapper {

    // select all
    public List<Brand> selectAll();

    // 查询详情，查看记录
    public Brand selectById(int id);

    // 多条件查询，三种类型
    // 1. selectByCondition(@Param("status") int status, @Param("companyName") String companyName, @Param("brandName") String brandName)
    // 2. selectByCondition(brand)
    // 3. selectByCondition(map)

    // public List<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String companyName, @Param("brandName") String brandName);

    //public List<Brand> selectByCondition(Brand brand);

    public List<Brand> selectByCondition(Map map);
    public List<Brand> selectByConditionSingle(Brand brand);


    /**
     *  添加功能
     * @param brand
     */
    public void add(Brand brand);

    /**
     *  更新功能
     * @param brand
     */
    public int update(Brand brand);

    public  void deleteById (int id);
    public  void deleteByIds (int[] ids);

}
