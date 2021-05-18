package com.warthur.nacos.consumer.service;

import org.springframework.stereotype.Component;

/**
 * @author warthur
 * @date 2021/05/11
 */
@Component
public class FeignTestFallBack implements FeignTestService {
    @Override
    public String getConfig() {
        return "feign请求异常";
    }
}
