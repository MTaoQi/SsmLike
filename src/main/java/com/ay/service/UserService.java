package com.ay.service;

import com.ay.dto.UserDTO;
import com.ay.model.User;
import org.apache.ibatis.annotations.Param;


//用户服务接口
public interface UserService {
    //通过id查询用户
    UserDTO find(String id);
    // 通过账号和密码查询用户
    void insertUser(String id,  String name,  String account);

}
