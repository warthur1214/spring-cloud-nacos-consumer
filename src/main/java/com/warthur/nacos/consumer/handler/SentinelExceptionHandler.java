package com.warthur.nacos.consumer.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;

/**
 * @author warthur
 * @date 2021/05/19
 */
@Slf4j
public class SentinelExceptionHandler {
    public static String blockExceptionHandle(String name, BlockException exception) {
        exception.printStackTrace();
        log.info("sentinel 熔断处理 {}", "SentinelExceptionHandler");
        return "Sentinel 熔断处理函数";
    }
}
