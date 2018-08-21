package com.yash.springpemapp.domain;


public class User {

    private int userId;
    private String name;
    private String phone;
    private String email;
    private String loginName;
    private String password;
    private int role;
    private int status;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public long getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }


    public long getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
