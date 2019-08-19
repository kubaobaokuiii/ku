package com.boms.guo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * eureka的客户端启动类
 * @author guo shaung
 * 服务提供者启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaUserApplication {

    public static void main(String[] args){

        SpringApplication.run(EurekaUserApplication.class,args);
    }

}
