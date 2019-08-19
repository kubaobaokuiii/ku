package com.boms.guo;

import com.boms.guo.port.StartCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot的启动类
 * @author guo shaung
 * @SpringBootApplication 表示该类是一个Spring boot应用
 * 默认端口8080
 */

@SpringBootApplication
public class App {
    public static void main(String[] args){

        //启动参数设置。比如自动生成端口
        new StartCommand(args);

        SpringApplication.run(App.class,args);
    }
}
