package com.ay.service.impl;
//用户服务类
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ay.dao.UserDao;
import com.ay.dto.UserDTO;
import com.ay.model.User;
import com.ay.service.UserService;
@Service
public class UserServiceImpl implements UserService{
    @Resource//按照实例名称进行装配
    private UserDao userDao;
    public UserDTO find(String id) {
        User user =userDao.find(id);
        return converMode12DTO(user);
    }

    @Override
    public void insertUser(String id, String name, String account) {
        this.userDao.insertUser(id,name,account);

    }

    //user转换UserDTO对象
    private UserDTO converMode12DTO(User user) {
        UserDTO userDTO=new UserDTO();
        userDTO.setId(user.getId());//主键
        userDTO.setAccount(user.getAccount());//账户
        userDTO.setName(user.getName());//用户名称
        return userDTO;
    }


}
