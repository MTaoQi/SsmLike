package com.ay.dto;

import com.ay.model.Mood;
//service层和DTO类
//前端展示DTO对象

//说说DTO
public class MoodDTO extends Mood{
    private String userName;//用户名称
    private String userAccount;//用户账号
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserAccount() {
        return userAccount;
    }
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }
}
