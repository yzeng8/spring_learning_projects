package com.yonyou.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//3.之前已经定义了controller这个bean，spring来扫描bean就行了。
// 创建springmvc的配置文件
@Configuration
@ComponentScan("com.yonyou.controller")
public class SpringConfig {
}
