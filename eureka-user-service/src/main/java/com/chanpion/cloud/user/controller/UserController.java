package com.chanpion.cloud.user.controller;

import com.chanpion.cloud.common.CommonResponse;
import com.chanpion.cloud.user.model.User;
import com.chanpion.cloud.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author April Chen
 * @date 2020/2/14 12:30
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Resource
    private UserService userService;

    @PostMapping("/create")
    public CommonResponse create(@RequestBody User user) {
        userService.create(user);
        return new CommonResponse();
    }

    @GetMapping("/{id}")
    public CommonResponse<User> getUser(@PathVariable Long id) {
        User user = userService.getUser(id);
        LOGGER.info("根据id获取用户信息，用户名称为：{}", user.getUsername());
        return new CommonResponse<>(user);
    }

    @GetMapping("/getUserByIds")
    public CommonResponse<List<User>> getUserByIds(@RequestParam List<Long> ids) {
        List<User> userList = userService.getUserByIds(ids);
        LOGGER.info("根据ids获取用户信息，用户列表为：{}", userList);
        return new CommonResponse<>(userList);
    }

    @GetMapping("/getByUsername")
    public CommonResponse<User> getByUsername(@RequestParam String username) {
        User user = userService.getByUsername(username);
        return new CommonResponse<>(user);
    }

    @PostMapping("/update")
    public CommonResponse update(@RequestBody User user) {
        userService.update(user);
        return new CommonResponse();
    }

    @PostMapping("/delete/{id}")
    public CommonResponse delete(@PathVariable Long id) {
        userService.delete(id);
        return new CommonResponse();
    }

}
