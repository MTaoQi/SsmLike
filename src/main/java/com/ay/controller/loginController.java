package com.ay.controller;

import com.ay.model.DbUser;
import com.ay.model.User;
import com.ay.service.DbUserService;
import com.ay.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class loginController {
    // 依赖注入
    @Resource
    private DbUserService dbUserService;

    /**
     * 用户登录
     */
    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public String login(String username, String password, Model model, HttpSession session) {
        // 通过账号和密码查询用户
        DbUser dbuser = dbUserService.findUser(username, password);
        if (dbuser != null) {
            // 将用户对象添加到Session
            session.setAttribute("USER_SESSION", dbuser);
            // 跳转到主页面
            return "redirect:mood/findAll.do";
        }
        model.addAttribute("msg", "账号或密码错误，请重新输入！");
        // 返回到登录页面
        return "login";
    }
    //向用户登录页面跳转
    @RequestMapping(value = "/login.do", method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }
}