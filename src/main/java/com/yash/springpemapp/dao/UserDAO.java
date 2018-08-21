package com.yash.springpemapp.dao;

import com.yash.springpemapp.domain.User;

import java.util.List;

public interface UserDAO {
    void save(User user);

    void update(User user);

    void delete(User user);

    void delete(Integer userId);

    User findById(Integer userId);

    List<User> findAll();

    List<User> findByProperty(String propertyName, Object propertyValue);
}
