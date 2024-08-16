package com.yonyou.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import javax.sql.DataSource;

@Configuration
@ComponentScan("com.yonyou")
@PropertySource({"classpath:jdbc.properties","classpath:userDefined.properties"})
@Import({JdbcConfig.class})
public class SpringConfig {

}
