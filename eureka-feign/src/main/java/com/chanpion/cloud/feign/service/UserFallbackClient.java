package com.chanpion.cloud.feign.service;

import com.chanpion.cloud.common.CommonResponse;
import com.chanpion.cloud.feign.model.User;
import org.springframework.stereotype.Component;

/**
 * @author April Chen
 * @date 2020/2/14 12:51
 */
@Component
public class UserFallbackClient implements UserClient {
    @Override
    public CommonResponse<User> getUser(Long id) {
        return null;
    }

//    public CommonResponse create(User user) {
//        return null;
//    }
//
//    public CommonResponse<User> getByUsername(String username) {
//        return null;
//    }
//
//    public CommonResponse update(User user) {
//        return null;
//    }
//
//    public CommonResponse delete(Long id) {
//        return null;
//    }
}
