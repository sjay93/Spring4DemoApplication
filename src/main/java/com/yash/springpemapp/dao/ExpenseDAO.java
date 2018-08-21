package com.yash.springpemapp.dao;

import com.yash.springpemapp.domain.Expense;

import java.util.List;

public interface ExpenseDAO {
    void save(Expense expense);

    void update(Expense expense);

    void delete(Expense expense);

    void delete(Integer expenseId);

    Expense findById(Integer expenseId);

    List<Expense> findAll();

    List<Expense> findByProperty(String propertyName, Object propertyValue);
}
