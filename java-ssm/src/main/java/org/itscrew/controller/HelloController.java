package org.itscrew.controller;

import org.itscrew.model.User;
import org.itscrew.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author it_screw
 * @date 2022/8/14 21:08
 * @description TODO
 */

@Controller
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println(helloService.hello());
        return "hello java-ssm";
    }

    @GetMapping("/hello2")
    public String hello2(){
        return "hello";
    }

    //mvc:view-controller

    @GetMapping("/hello4")
    @ResponseBody
    public List<User> getNames(){
        List<User> names = new ArrayList<>();
        for (int i = 0;i < 10;i++){
            names.add(new User("itscrew:" + i,new Date()));
        }
        return names;
    }
}
