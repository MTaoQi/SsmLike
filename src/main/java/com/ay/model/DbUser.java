package com.ay.model;

import java.io.Serializable;

public class DbUser implements Serializable {
    private Integer user_id; // 用户id
    private String user_name; // 用户名称
    private String user_pass; // 用户密码
    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }
}
