package com.yash.springpemapp.dao;

import com.yash.springpemapp.domain.Category;

import java.util.List;

public interface CategoryDAO {
    void save(Category category);

    void update(Category category);

    void delete(Category category);

    void delete(Integer categoryId);

    Category findById(Integer categoryId);

    List<Category> findAll();

    List<Category> findByProperty(String propertyName, Object propertyValue);
}
