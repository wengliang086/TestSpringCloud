package com.my.test.sericefeign.service;

import com.my.test.common.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi-client", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping("/hi")
    String sayHiFromClient(@RequestParam("name") String name);

    @RequestMapping("/login")
    String login(User user);
}
