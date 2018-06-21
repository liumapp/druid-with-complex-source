package com.liumapp.demo.mybatis.complex.api.conf;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author liumapp
 * @file DatasourceConfig.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/15/18
 */
@Configuration
public class DatasourceConfig {

    /**
     * \@Primary必须在此添加上
     * 该注解表示在同一个接口有多个实现类可以注入的时候，默认选择哪一个，而不是让autowire注解报错，官网要求当多个数据源时，必须指定一个datasource，另一个datasource则不用添加。
     */
    @Primary
    @Bean(name = "primaryDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.primary")
    public DataSource primaryDataSource () {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "secondDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.second")
    public DataSource secondDataSource () {
        return DataSourceBuilder.create().build();
    }

}
