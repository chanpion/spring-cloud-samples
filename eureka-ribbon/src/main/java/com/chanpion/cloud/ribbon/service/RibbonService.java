package com.chanpion.cloud.ribbon.service;

import com.chanpion.cloud.common.CommonResponse;
import com.chanpion.cloud.common.model.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author April Chen
 * @date 2020/2/19 9:55
 */
@Service
public class RibbonService {
    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    CommonResponse<User> getUser(Long id) {
        return restTemplate.getForObject("http://eureka-user-service/user/{1}", CommonResponse.class, id);
    }

    public CommonResponse fallback(Long id) {
        return new CommonResponse(null, -1, "error");
    }
}
