package com.zc.blog.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName MessageController
 * @Description TODO
 * @Author zhu_c
 * @Date 2020/9/25 16:42
 **/
@RestController
public class MessageController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/show")
    public String showMessage(@RequestParam String name){
        return restTemplate.getForObject("http://producer/get?name="+name,String.class);
    }
}
