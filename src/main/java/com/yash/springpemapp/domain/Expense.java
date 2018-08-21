package com.yash.springpemapp.domain;


import java.util.Date;

public class Expense {

    private int id;
    private int categoryId;
    private double amount;
    private Date date;
    private String remark;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
