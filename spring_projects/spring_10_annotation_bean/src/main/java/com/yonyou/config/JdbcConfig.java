package com.yonyou.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;


public class JdbcConfig {
    @Value("${jbdc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DataSource dataSource(){

        //硬编码的方式,不推荐,得用@value的方式从properties导入.
//        DruidDataSource datasource = new DruidDataSource();
//        datasource.setDriverClassName("com.mysql.jdbc.Driver");
//        datasource.setUrl("jdbc:mysql://localhost:3306/config");
//        datasource.setUsername("root");
//        datasource.setPassword("root");
//        return datasource;

        //新方式
        DruidDataSource datasource = new DruidDataSource();
        datasource.setDriverClassName(driver);
        datasource.setUrl(url);
        datasource.setUsername(username);
        datasource.setPassword(password);
        return datasource;
    }
}
