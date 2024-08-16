package com.yonyou.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

public class JdbcConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource datasource){
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        ssfb.setTypeAliasesPackage("com.yonyou.pojo");
        ssfb.setDataSource(datasource);
        return ssfb;
    }

    @Bean
    public MapperScannerConfigurer getMapperScannerConfigurer(){

        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.yonyou.dao");
        return msc;
    }


}
