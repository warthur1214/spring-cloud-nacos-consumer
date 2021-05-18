package com.warthur.nacos.consumer.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author warthur
 * @date 2021/05/18
 */
@Configuration
public class BeanConfig {

    @Value("${spring.application.name}")
    private String appName;

    @Bean
    public SpringApp springApp() {
        return new SpringApp().setAppName(appName);
    }
}
