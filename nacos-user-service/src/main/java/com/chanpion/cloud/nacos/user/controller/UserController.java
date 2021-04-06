package com.chanpion.cloud.nacos.user.controller;

import com.alibaba.csp.sentinel.adapter.spring.webflux.exception.SentinelBlockExceptionHandler;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.chanpion.cloud.common.CommonResponse;
import com.chanpion.cloud.common.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author April Chen
 * @date 2020/2/14 14:20
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/{id}")
    @SentinelResource(value = "",blockHandler = "doOnBlock",blockHandlerClass = SentinelBlockExceptionHandler.class)
    public CommonResponse getUser(@PathVariable Long id) {
        return new CommonResponse(new User(10L, "nacos"));
    }
}
