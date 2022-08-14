package org.itscrew.controller;

import org.itscrew.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author it_screw
 * @date 2022/8/14 17:05
 * @description hello world
 */

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String hello(){
        String hello = helloService.hello();
        System.out.println(hello);
        return "hello ssm";
    }
}
