package com.chanpion.cloud.user.service;

import com.chanpion.cloud.user.model.User;

import java.util.List;

/**
 * @author April Chen
 * @date 2020/2/14 12:30
 */
public interface UserService {

    void create(User user);

    User getUser(Long id);

    void update(User user);

    void delete(Long id);

    User getByUsername(String username);

    List<User> getUserByIds(List<Long> ids);
}
