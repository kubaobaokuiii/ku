package com.boms.guo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务消费者（文章服务）启动类
 * @author guo shuang
 */
@SpringBootApplication
@EnableEurekaClient
public class ArticleClientApplication {

    public static void main(String[] args){

        SpringApplication.run(ArticleClientApplication.class,args);

    }
}
