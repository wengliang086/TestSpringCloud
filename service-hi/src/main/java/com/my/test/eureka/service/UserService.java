package com.my.test.eureka.service;

import com.my.test.common.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {

    @RequestMapping("login")
    public String login(@RequestBody User user) {
        if (user != null && "admin".equals(user.getUsername()) && "111111".equals(user.getPassword())) {
            return "login success";
        } else {
            return "login fail";
        }
    }
}
