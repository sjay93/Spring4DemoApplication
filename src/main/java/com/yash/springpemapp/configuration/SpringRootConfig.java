package com.yash.springpemapp.configuration;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * Email sender and other beans are incorporated at the service level so we will declare here.
 */
@Configuration
@ComponentScan(basePackages = {"com.yash.springpemapp.daoimpl"})
public class SpringRootConfig {

    @Bean
    public BasicDataSource getDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/pemdb");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setMaxTotal(2);
        dataSource.setInitialSize(1);
        dataSource.setTestOnBorrow(true);
        dataSource.setValidationQuery("Select 1");
        dataSource.setDefaultAutoCommit(true);
        return dataSource;
    }
}
