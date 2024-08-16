package com.yonyou.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.yonyou")
@Import({DataSource.class, JdbcConfig.class})
public class SpringConfig {

}
