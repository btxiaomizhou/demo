package com.github.demo.springbootmybatisjta.service;

import com.github.demo.springbootmybatisjta.dao.luckdog.UserLuckDogDao;
import com.github.demo.springbootmybatisjta.dao.test.UserTestDao;
import com.github.demo.springbootmybatisjta.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserLuckDogDao userLuckDogDao;
    @Resource
    private UserTestDao userTestDao;


    @Override
    @Transactional
    public void addUser() {
        Map<String,String> hash = new HashMap<>();
        hash.put("id","2");
        hash.put("name","123");
        hash.put("password","123");
        userLuckDogDao.addUser(hash);
        userTestDao.addUser(hash);

    }

    @Override
    public List<User> getLuckDogUser() {
        return userLuckDogDao.getLuckDogUser();
    }

    @Override
    public List<User> getTestUser() {
        return userTestDao.getTestUser();
    }
}
