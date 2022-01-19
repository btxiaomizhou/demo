package com.github.demo.springbootmybatisjta.dao.test;

import com.github.demo.springbootmybatisjta.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserTestDao {
    public void addUser(Map<String, String> hash);

    public List<User> getTestUser();
}
