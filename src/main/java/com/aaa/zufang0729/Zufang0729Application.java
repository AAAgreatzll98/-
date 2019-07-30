package com.aaa.zufang0729;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.aaa.zufang0729.dao")
public class Zufang0729Application {

    public static void main(String[] args) {
        SpringApplication.run(Zufang0729Application.class, args);
    }

}
