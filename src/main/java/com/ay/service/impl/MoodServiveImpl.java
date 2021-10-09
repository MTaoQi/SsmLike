package com.ay.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.ay.dao.MoodDao;
import com.ay.dao.UserDao;
import com.ay.dto.MoodDTO;
import com.ay.model.Mood;
import com.ay.model.User;
import com.ay.service.MoodService;
//说说服务类


// @Service 是把 spring 容器中的 bean 进行实例化，也就是等同于 new 操作
// 控制反转，将 Java 对象交给 Spring 容器创建。
@Service
public class MoodServiveImpl implements MoodService {
    @Resource
    //依赖注入
    private MoodDao moodDao;

    @Resource
    private UserDao userDao;

    @Override//@Override是伪代码,表示重写(当然不写也可以)
    public List<MoodDTO> findAll() {
        //查询所有说说
        List<Mood> moodList=moodDao.findAll();
        //转换为DTO对象
        return converMode12DTO(moodList);
    }

    private List<MoodDTO> converMode12DTO(List<Mood> moodList){
        if(CollectionUtils.isEmpty(moodList)) return Collections.EMPTY_LIST;
        List<MoodDTO> moodDTOList=new ArrayList<MoodDTO>();
       // ArrayList 是一个数组队列，提供了相关的添加、删除、修改、遍历等功能。
        for(Mood mood:moodList) {
            MoodDTO moodDTO=new MoodDTO();
            moodDTO.setId(mood.getId());
            moodDTO.setContent(mood.getContent());
            moodDTO.setPraiseNum(mood.getPraiseNum());
            moodDTO.setPublishTime(mood.getPublishTime());
            moodDTO.setUserId(mood.getUserId());//查询每一条说说对应用户
            moodDTOList.add(moodDTO);
            //设置用户信息
            User user=userDao.find(mood.getUserId());
            moodDTO.setUserName(user.getName());
            moodDTO.setUserAccount(user.getAccount());	//账号
        }
        return moodDTOList;
    }

}
