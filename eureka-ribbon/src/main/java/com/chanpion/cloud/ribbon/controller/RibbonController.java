package com.chanpion.cloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author April Chen
 * @date 2020/2/14 12:05
 */
@RestController
public class RibbonController {
    @Value("${service-url.eureka-client}")
    private String url;

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/health/{path}")
    public Object health(@PathVariable String path) {
        return restTemplate.getForObject(url + path, String.class);
    }
}
