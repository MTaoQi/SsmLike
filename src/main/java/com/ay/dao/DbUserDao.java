package com.ay.dao;

import com.ay.model.DbUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DbUserDao {
    /**
     * 通过账号和密码查询用户
     */
    public DbUser findUser(@Param("username") String username,
                           @Param("password") String password);
}
