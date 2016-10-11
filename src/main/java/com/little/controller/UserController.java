package com.little.controller;

import com.little.model.domain.User;
import com.little.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author pengx
 * @date 2016/9/30
 */

@Controller
@RequestMapping(value = "userInfo")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "")
    public String getUser(HttpServletRequest request) {

        User user = null;
        try {
            user = userService.getUser("1");
            request.setAttribute("name", user.getName());
            request.setAttribute("sex", user.getSex());
            request.setAttribute("age", user.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }


        return "userInfo";
    }
}
