package com.ay.service;

import com.ay.model.DbUser;

public interface DbUserService {
    // 通过账号和密码查询用户
    public DbUser findUser(String username, String password);
}
