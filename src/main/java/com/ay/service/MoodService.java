package com.ay.service;

import com.ay.dto.MoodDTO;

import java.util.List;


//说说接口
public interface MoodService {
    //查询所有说说
    List<MoodDTO> findAll();


}
