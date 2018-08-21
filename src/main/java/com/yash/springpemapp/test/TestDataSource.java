package com.yash.springpemapp.test;

import com.yash.springpemapp.configuration.SpringRootConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class TestDataSource {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        DataSource dataSource = context.getBean(DataSource.class);
        JdbcTemplate template = new JdbcTemplate(dataSource);
        String sql = "insert into users(name, phone, email, loginName, password) values (?,?,?,?,?)";
        Object[] params = new Object[]{"Jay Shah", "6822569967", "jay.shah@yash.com", "jay", "shah"};
        template.update(sql, params);
        System.out.println("SQL Inserted");
    }
}
