package com.boms.guo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplate调用接口
 * @author guo shuang
 * 创建接口，调用user/hello
 */
@RestController
public class ArticleController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/article/callHello")
    public String callHello(){

        return restTemplate.getForObject("http://localhost:8081/user/hello",String.class);

    }

    @GetMapping("/article/callHello2")
    public String callHello2(){

        return restTemplate.getForObject("http://eureka-client-user-service/user/hello",String.class);

    }



}
