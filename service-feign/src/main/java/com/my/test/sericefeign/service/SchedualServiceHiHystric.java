package com.my.test.sericefeign.service;

import com.my.test.common.model.User;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClient(String name) {
        return "sorry " + name;
    }

    @Override
    public String login(User user) {
        return "please try latter!";
    }
}
