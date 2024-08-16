package com.yonyou.config;


import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;


public class MybatisConfig {
    @Bean
    public SqlSessionFactoryBean sessionFactory(DataSource dataSource) throws IOException {
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        ssfb.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath:StudentDao.xml")); //用这个扫描resources里的包
        ssfb.setTypeAliasesPackage("com.yonyou.pojo");
        ssfb.setDataSource(dataSource);
        return ssfb;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.yonyou.dao");
        return msc;
    }
}
