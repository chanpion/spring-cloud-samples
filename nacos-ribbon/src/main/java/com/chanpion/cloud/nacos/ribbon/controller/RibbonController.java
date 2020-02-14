package com.chanpion.cloud.nacos.ribbon.controller;

import com.chanpion.cloud.common.CommonResponse;
import com.chanpion.cloud.common.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author April Chen
 * @date 2020/2/14 14:16
 */
@RestController
@RequestMapping("/user")
public class RibbonController {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/{id}")
    public CommonResponse getUser(@PathVariable long id) {
        return restTemplate.getForObject("http://nacos-user-service/user/{1}", CommonResponse.class, id);
    }
}
