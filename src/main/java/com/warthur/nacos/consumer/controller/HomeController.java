package com.warthur.nacos.consumer.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.SentinelRpcException;
import com.warthur.nacos.consumer.handler.SentinelExceptionHandler;
import com.warthur.nacos.consumer.service.FeignTestService;
import com.warthur.nacos.dubbo.TestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author warthur
 * @date 2021/03/13
 */
@RestController
public class HomeController {

    @Resource
    private FeignTestService feignTestService;

    @DubboReference
    private TestService testService;

    @GetMapping("/test")
    public String test() {

        return "success";
    }

    @GetMapping("/feign/invoke")
    public String feignInvoke() {

        return feignTestService.getConfig();
    }

    @GetMapping("/dubbo/invoke")
    public String getInvokeResult() {

        return testService.getConfig();
    }
}
