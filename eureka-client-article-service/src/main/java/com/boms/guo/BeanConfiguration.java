package com.boms.guo;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplate的配置使用（调用接口）
 * @author guo shuang
 */
@Configuration
public class BeanConfiguration {

//    @Bean
//    public RestTemplate getRestTemplate(){
//
//        return new RestTemplate();
//    }

    /**
     * 对应控制器调用接口的服务名称
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){

        return new RestTemplate();
    }

}
