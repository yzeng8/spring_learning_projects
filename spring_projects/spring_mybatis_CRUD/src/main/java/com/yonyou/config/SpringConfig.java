package com.yonyou.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.yonyou")
@PropertySource("classpath:jdbc.properties")
//@MapperScan(basePackages = {"com.yonyou"})
@Import({MybatisConfig.class, JdbcConfig.class})
public class SpringConfig {

}
