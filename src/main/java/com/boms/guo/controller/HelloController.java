package com.boms.guo.controller;


import com.boms.guo.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 编写第一个REST接口
 * @author guo shuang
 * @RestController 是@Controller与@ResponseBody的组合注解，可以直接返回json数据
 * @GetMapping 是@RequestMapping(method = RequestNethod.GET)
 */
@RestController
public class HelloController {

    //注入对象
//    @Autowired
//    private Environment env;

    //注入配置
//    @Value("${server.port}")
//    private String port;

    //获取自定义config
    @Autowired
    private MyConfig myConfig;


    @GetMapping("/hello")
    public String hello(){

       // return "hello";

        //读取配置
//        String port = env.getProperty("server.port");

        return myConfig.getName();

    }
}
