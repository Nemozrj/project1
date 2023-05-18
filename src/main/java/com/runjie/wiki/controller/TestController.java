package com.runjie.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

//    Test是默认值, 优先读配置文件
    @Value("${test.hello:Test}")
    private String testHello;
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!" + testHello ;
    }

    @PostMapping ("/hello/post")
    public String helloPost(String name){
        return "Hello World! Post, " + name;
    }
}
