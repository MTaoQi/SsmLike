package com.ay.controller;
//用户控制层

import javax.annotation.Resource;

import com.ay.dto.MoodDTO;
import com.ay.dto.UserDTO;
import com.ay.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ay.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/find.do")
    public String find(Model model) {

        UserDTO user = userService.find("1");

        model.addAttribute("user", user);

        return "user";
    }

    @RequestMapping("/finduser.do")
    public String insertUser(String id, String name, String account) {
        this.userService.insertUser(id, name, account);
        return "addUser";
    }

    @RequestMapping(value = "showUser.do")
    public String show() {
        return "addUser";
    }
}
