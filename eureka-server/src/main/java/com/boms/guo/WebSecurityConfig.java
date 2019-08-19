package com.boms.guo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * security的配置类
 * @author guo shuang
 */
@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    protected void configure(HttpSecurity http) throws Exception{

        //关闭csrf
        http.csrf().disable();

        //支持httpBasic
        http.authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();

    }


}
