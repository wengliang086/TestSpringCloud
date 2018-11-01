package com.my.test.sericefeign.controller;

import com.my.test.common.model.User;
import com.my.test.sericefeign.service.SchedualServiceHi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HiController {

    @Resource
    private SchedualServiceHi schedualServiceHi;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClient(name) + " -- from service feign";
    }

    @GetMapping("/login")
    public String login(User user) {
        return schedualServiceHi.login(user);
    }
}
