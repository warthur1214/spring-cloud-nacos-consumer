package com.warthur.nacos.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author warthur
 * @date 2021/05/11
 */
@FeignClient(value = "spring-cloud-nacos-demo", fallback = FeignTestFallBack.class)
public interface FeignTestService {

    @GetMapping("/dubbo/config")
    String getConfig();
}
