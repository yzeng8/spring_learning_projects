package com.yonyou;

import com.yonyou.mapper.UserMapper;
import com.yonyou.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


// mybatis的代理开发
//
public class MyBatisDemo2 {

    public static void main(String[] args) throws IOException {

        //1. 加载核心的配置文件，获取sqlFactorySession对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取SqlSession 对象，用它来执行sql对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.执行sql，引号内是执行命令的namespace加id
//      List<User> users = sqlSession.selectList("test.selectAll");
        //3.1 获取代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        List<User> users = userMapper.selectAll();

        System.out.println(users);

        //4.释放资源
        sqlSession.close();
    }
}
