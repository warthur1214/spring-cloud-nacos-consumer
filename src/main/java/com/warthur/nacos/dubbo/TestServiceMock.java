package com.warthur.nacos.dubbo;

/**
 * @author warthur
 * @date 2021/05/18
 */
public class TestServiceMock implements TestService {
    @Override
    public String getConfig() {
        return "服务降级";
    }
}
