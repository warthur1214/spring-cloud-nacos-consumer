package com.warthur.nacos.consumer.handler;

import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author warthur
 * @date 2021/03/13
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus
    public String systemExceptionGet(Exception e) {
        log.error("系统异常", e);

        return e.getMessage();
    }

    @ExceptionHandler(FlowException.class)
    @ResponseStatus
    public String flowExceptionGet(FlowException e) {
        log.error("sentinel异常：", e);

        return "sentinel限流";
    }

    @ExceptionHandler(DegradeException.class)
    @ResponseStatus
    public String degradeExceptionGet(DegradeException e) {
        log.error("sentinel异常：", e);

        return "sentinel降级";
    }
}
