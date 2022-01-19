package com.github.demo.springbootmybatisjta;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.github.demo.springbootmybatisjta.dao")使用MapperScan批量扫描所有的Mapper接口；
public class SpringbootMybatisJtaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisJtaApplication.class, args);
    }

}
