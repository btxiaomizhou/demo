package com.github.demo.springbootmybatisjta.service;

import com.github.demo.springbootmybatisjta.entity.User;

import java.util.List;

public interface UserService {
    public void addUser();

    public List<User> getLuckDogUser();

    public List<User> getTestUser();
}
