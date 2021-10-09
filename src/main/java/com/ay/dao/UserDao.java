package com.ay.dao;
//dao层和Mapper映射文件

//用户dao

import com.ay.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao {
    //查询用户
    User find(@Param("id") String id);

    void insertUser(@Param("id") String id, @Param("name") String name, @Param("account") String account);

}
