package com.ay.service.impl;
//用户说说点赞关联服务类
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ay.dao.UserMoodPraiseRelDao;
import com.ay.model.UserMoodPraiseRel;
import com.ay.service.UserMoodPraiseRelService;
@Service
public class UserMoodPraiseRelServiceImpl implements UserMoodPraiseRelService {
    @Resource
    private UserMoodPraiseRelDao userMoodPraiseRelDao;
    @Override
    public boolean save(UserMoodPraiseRel userMoodPraiseRel) {

        return userMoodPraiseRelDao.save(userMoodPraiseRel);
    }

}
