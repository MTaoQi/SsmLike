package com.ay.controller;
//说说控制层
import java.util.List;

import javax.annotation.Resource;

//import com.ay.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ay.dto.MoodDTO;
import com.ay.service.MoodService;

@Controller
@RequestMapping("/mood")
public class MoodController {
    @Resource
    private MoodService moodService;

    @RequestMapping("/findAll.do")
    public String findAll(Model model) {
        List<MoodDTO> moodDTOList=moodService.findAll();
        model.addAttribute("moods",moodDTOList);
        return "mood";
    }
//    @RequestMapping("/findById.do")
//    public String find(Model model) {
//
//        MoodDTO mood = moodService.find("1");
//
//        model.addAttribute("mood", mood);
//
//        return "mood";
//    }

}
