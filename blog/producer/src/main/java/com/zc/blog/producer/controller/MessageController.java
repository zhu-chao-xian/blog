package com.zc.blog.producer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ClassName MessageController
 * @Description TODO
 * @Author zhu_c
 * @Date 2020/9/25 15:49
 **/
@RestController
public class MessageController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/get")
    public String getMessage(@RequestParam("name")String name){
        return "Hi " + name + " ,I am from port:" + port;
    }
}
