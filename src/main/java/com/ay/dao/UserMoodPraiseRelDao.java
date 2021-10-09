package com.ay.dao;


import com.ay.model.UserMoodPraiseRel;
import org.springframework.stereotype.Repository;

import javax.websocket.server.PathParam;

//用户说说点赞关联Dao
@Repository
public interface UserMoodPraiseRelDao {
    boolean save(@PathParam("userMoodPraiseRel") UserMoodPraiseRel userMoodPraiseRel);
//save用来保存说说被用户点赞的记录
}
