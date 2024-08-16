package com.yonyou.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

//4.定义一个servlet容器的配置类，在里面加载spring的配置
public class ServletContainterInitConfig extends AbstractDispatcherServletInitializer {
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringConfig.class); //加载这个类
        return ctx;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"}; //所有请求都归springmvc管
    }

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
