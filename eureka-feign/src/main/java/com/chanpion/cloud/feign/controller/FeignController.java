package com.chanpion.cloud.feign.controller;

import com.chanpion.cloud.common.CommonResponse;
import com.chanpion.cloud.feign.model.User;
import com.chanpion.cloud.feign.service.UserClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author April Chen
 * @date 2020/2/14 12:52
 */
@RestController
@RequestMapping("/user")
public class FeignController {
    @Resource
    private UserClient userClient;

    @RequestMapping("/{id}")
    public CommonResponse<User> getUser(@PathVariable Long id) {
        return userClient.getUser(id);
    }
}
