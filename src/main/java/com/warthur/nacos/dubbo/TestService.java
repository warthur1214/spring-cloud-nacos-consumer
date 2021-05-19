package com.warthur.nacos.dubbo;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

/**
 * @author warthur
 * @date 2020/12/03
 */
@SentinelResource(value = "com.warthur.nacos.dubbo.TestService", fallback = "getConfigFallBack")
public interface TestService {

    String getConfig();

    default String getConfigFallBack() {
        System.out.println("服务降级");
        return "服务降级";
    }
}
