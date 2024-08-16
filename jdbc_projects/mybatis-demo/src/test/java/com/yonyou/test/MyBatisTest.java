package com.yonyou.test;
import com.yonyou.mapper.BrandMapper;
import com.yonyou.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBatisTest {

    @Test
    public void testselectAll() throws IOException {
        //1. get sqlFactory object
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. get sqlSession object
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3. get proxy object of the mapper method
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4. execute the sql
        List<Brand> brands = brandMapper.selectAll();  // only line need to be modified in spring

        System.out.println(brands);
        //5. release the resources
        sqlSession.close();
    }

    @Test
    public void testselectById() throws IOException {
        int id = 1;
        //1. get sqlFactory object
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. get sqlSession object
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3. get proxy object of the mapper method
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4. execute the sql
        Brand brand = brandMapper.selectById(id);  // only line need to be modified in spring

        System.out.println(brand);
        //5. release the resources
        sqlSession.close();
    }


    @Test
    public void testselectByCondition() throws IOException {
        // 接收参数
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";
        // 处理参数
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";

        // 封装参数
//        Brand brand = new Brand();
//        brand.setCompanyName(companyName);
//        brand.setBrandName(brandName);
//        brand.setStatus(status);
        // 转换map
        Map map = new HashMap();
        //map.put("status",status);
        map.put("companyName",companyName);
        //map.put("brandName",brandName);


        //1. get sqlFactory object
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. get sqlSession object
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3. get proxy object of the mapper method
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4. execute the sql
//        List<Brand> brands = brandMapper.selectByCondition(status,companyName,brandName);  // only line need to be modified in spring
        //List<Brand> brands = brandMapper.selectByCondition(brand);

        List<Brand> brands = brandMapper.selectByCondition(map);

        System.out.println(brands);
        //5. release the resources
        sqlSession.close();
    }


    @Test
    public void testselectByConditionSingle() throws IOException {
        // 接收参数
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";
        // 处理参数
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";

        //      封装参数
        Brand brand = new Brand();
        brand.setCompanyName(companyName);
//        brand.setBrandName(brandName);
//        brand.setStatus(status);
        // 转换map
//        Map map = new HashMap();
//        //map.put("status",status);
//        map.put("companyName",companyName);
//        //map.put("brandName",brandName);


        //1. get sqlFactory object
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. get sqlSession object
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3. get proxy object of the mapper method
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4. execute the sql
//        List<Brand> brands = brandMapper.selectByCondition(status,companyName,brandName);  // only line need to be modified in spring
        //List<Brand> brands = brandMapper.selectByCondition(brand);

        List<Brand> brands = brandMapper.selectByConditionSingle(brand);

        System.out.println(brands);
        //5. release the resources
        sqlSession.close();
    }

    @Test
    public void testAdd() throws IOException {
        // 接收参数
        int status = 1;
        String companyName = "波导手机";
        String brandName = "波导";
        String description = "手机中的战斗机";
        int order = 100;


        //      封装参数
        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setBrandName(brandName);
        brand.setDescription(description);
        brand.setOrdered(order);


        //1. get sqlFactory object
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. get sqlSession object
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3. get proxy object of the mapper method
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4. execute the sql
//        List<Brand> brands = brandMapper.selectByCondition(status,companyName,brandName);  // only line need to be modified in spring
        //List<Brand> brands = brandMapper.selectByCondition(brand);

        brandMapper.add(brand);
//        System.out.println();
        // 手动提交

        sqlSession.commit();

        //5. release the resources
        sqlSession.close();
    }

    @Test
    public void testAdd2() throws IOException {
        // 接收参数
        int status = 1;
        String companyName = "波导手机";
        String brandName = "波导";
        String description = "手机中的战斗机";
        int order = 100;


        //      封装参数
        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setBrandName(brandName);
        brand.setDescription(description);
        brand.setOrdered(order);


        //1. get sqlFactory object
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. get sqlSession object
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3. get proxy object of the mapper method
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4. execute the sql
//        List<Brand> brands = brandMapper.selectByCondition(status,companyName,brandName);  // only line need to be modified in spring
        //List<Brand> brands = brandMapper.selectByCondition(brand);

        brandMapper.add(brand);
        Integer id = brand.getId();
        System.out.println(id);
        // 手动提交

        sqlSession.commit();

        //5. release the resources
        sqlSession.close();
    }

    @Test
    public void testUpdate() throws IOException {
        // 接收参数
        int status = 0;
        String companyName = "波导手机";
        String brandName = "波导";
        String description = "手机中的战斗机!";
        int order = 50;
        int id = 5;


        //      封装参数
        Brand brand = new Brand();
        brand.setStatus(status);
//        brand.setCompanyName(companyName);
//        brand.setBrandName(brandName);
//        brand.setDescription(description);
//        brand.setOrdered(order);
        brand.setId(id);


        //1. get sqlFactory object
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. get sqlSession object
        // true意味着自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        //3. get proxy object of the mapper method
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4. execute the sql
//        List<Brand> brands = brandMapper.selectByCondition(status,companyName,brandName);  // only line need to be modified in spring
        //List<Brand> brands = brandMapper.selectByCondition(brand);

        int col = brandMapper.update(brand);
        System.out.println(col);
        // 手动提交


        //5. release the resources
        sqlSession.close();
    }

    @Test
    public void testDeleteById() throws IOException {
        // 接收参数
        int status = 0;
        int id = 6;


        //1. get sqlFactory object
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. get sqlSession object
        // true意味着自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        //3. get proxy object of the mapper method
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4. execute the sql
//        List<Brand> brands = brandMapper.selectByCondition(status,companyName,brandName);  // only line need to be modified in spring
        //List<Brand> brands = brandMapper.selectByCondition(brand);

        brandMapper.deleteById(id);
        //System.out.println(col);
        // 手动提交


        //5. release the resources
        sqlSession.close();
    }

    @Test
    public void testDeleteByIds() throws IOException {
        // 接收参数
        int status = 0;
        int[] ids = {5,7};


        //1. get sqlFactory object
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. get sqlSession object
        // true意味着自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        //3. get proxy object of the mapper method
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4. execute the sql
//        List<Brand> brands = brandMapper.selectByCondition(status,companyName,brandName);  // only line need to be modified in spring
        //List<Brand> brands = brandMapper.selectByCondition(brand);

        brandMapper.deleteByIds(ids);
        //System.out.println(col);
        // 手动提交


        //5. release the resources
        sqlSession.close();
    }

}
