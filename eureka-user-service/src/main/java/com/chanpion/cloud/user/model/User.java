package com.chanpion.cloud.user.model;

/**
 * @author April Chen
 * @date 2020/2/14 12:30
 */
public class User {
    private Long id;
    private String username;

    public User() {
    }

    public User(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
