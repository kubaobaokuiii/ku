package com.boms.guo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 自定义配置类，并在启动类获取该配置
 */
@Component
@ConfigurationProperties(prefix = "com.boms.guo")
public class MyConfig {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
