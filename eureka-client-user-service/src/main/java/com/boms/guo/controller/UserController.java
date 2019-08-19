package com.boms.guo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器
 * @author guo shaung
 */
@RestController
public class UserController {

    @GetMapping("/user/hello")
    public String hello(){

        return "hello";

    }
}
