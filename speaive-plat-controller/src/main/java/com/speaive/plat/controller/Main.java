package com.speaive.plat.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xuhongzhuo
 * @description
 * @create 2025/1/24 12:24
 */
@SpringBootApplication
@MapperScan("com.speaive.plat.dao.mapper")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}