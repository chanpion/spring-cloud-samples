package com.chanpion.cloud.feign.service;

import com.chanpion.cloud.common.CommonResponse;
import com.chanpion.cloud.feign.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author April Chen
 * @date 2020/2/14 12:48
 */
@FeignClient(name = "user-service", fallback = UserFallbackClient.class)
public interface UserClient {

    @GetMapping("/user/{id}")
    CommonResponse<User> getUser(@PathVariable("id") Long id);

//    @PostMapping("/user/create")
//    CommonResponse create(@RequestBody User user);
//
//    @GetMapping("/user/getByUsername")
//    CommonResponse<User> getByUsername(@RequestParam String username);
//
//    @PostMapping("/user/update")
//    CommonResponse update(@RequestBody User user);
//
//    @PostMapping("/user/delete/{id}")
//    CommonResponse delete(@PathVariable Long id);
}
