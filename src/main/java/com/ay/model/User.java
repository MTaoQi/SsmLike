package com.ay.model;

import java.io.Serializable;

//用户表
public class User implements Serializable {

    private String id;//主键
    private String name;//用户名称
    private String account;//账户

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", account='" + account + '\'' +
//                '}';
//    }
}
