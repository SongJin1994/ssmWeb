package com.song.web.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by sj124 on 2016/8/31.
 */
@Configuration
@ImportResource("/com/song/web/config/xml/spring-mybatis.xml")
@ComponentScan(basePackages ={"com.song.web"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class)})
public class RootConfig {
    /*@Bean
    public BasicDataSource dataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3309/baron");
        dataSource.setUsername("root");
        dataSource.setPassword("songjin");
        dataSource.setInitialSize(5);
        dataSource.setMaxOpenPreparedStatements(10);
        return dataSource;
    }*/
}
