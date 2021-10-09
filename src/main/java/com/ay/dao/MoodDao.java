package com.ay.dao;
//dao层和Mapper映射文件
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ay.model.Mood;
//Repository用在持久层的接口上，这个注解是将接口的一个实现类交给spring管理。
@Repository//Dao数据访问层
public interface MoodDao {
    List<Mood> findAll();
    List<Mood> findById();
}
