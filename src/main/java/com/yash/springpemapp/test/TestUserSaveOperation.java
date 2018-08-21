package com.yash.springpemapp.test;

import com.yash.springpemapp.configuration.SpringRootConfig;
import com.yash.springpemapp.dao.UserDAO;
import com.yash.springpemapp.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserSaveOperation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDAO userDAO = context.getBean(UserDAO.class);
        User user = new User();
        user.setName("Jay Shah");
        user.setPhone("682-256-9967");
        user.setEmail("jay.shah@yash.com");
        user.setLoginName("s.jay93");
        user.setPassword("Jvsshah@123");

        userDAO.save(user);
        System.out.println("User Saved!");
    }
}
