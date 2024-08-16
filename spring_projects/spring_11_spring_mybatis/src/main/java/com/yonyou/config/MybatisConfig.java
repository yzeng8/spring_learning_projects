package com.yonyou.config;


import com.yonyou.domain.Account;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource ds){
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        ssfb.setTypeAliasesPackage("com.yonyou.domain");
        ssfb.setDataSource(ds);
        return ssfb;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.yonyou.dao");
        return msc;
    }



}

// 代替xml文件的内容
//<typeAliases>
//        <package name="com.yonyou.domain"/>
//    </typeAliases>
//
//    <environments default="mysql">
//        <environment id="mysql">
//            <transactionManager type="JDBC"/>
//            <dataSource type="POOLED">
//                <property name="driver" value="${jdbc.driver}"/>
//                <property name="url" value="${jdbc.url}"/>
//                <property name="username" value="${jdbc.username}"/>
//                <property name="password" value="${jdbc.password}"/>
//            </dataSource>
//        </environment>
//    </environments>


//单独的bean进行自动代理
//    <mappers>
//        <package name="com.yonyou.dao"/>
//    </mappers>