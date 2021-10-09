package com.ay.service.impl;

import com.ay.dao.DbUserDao;
import com.ay.model.DbUser;
import com.ay.service.DbUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DbUserServiceImpl implements DbUserService {

    // 注入UserDao
    @Resource//按照实例名称进行装配
    private DbUserDao dbUserDao;

    // 通过账号和密码查询用户
    @Override
    public DbUser findUser(String username, String password) {
        return this.dbUserDao.findUser(username, password);
    }

}
