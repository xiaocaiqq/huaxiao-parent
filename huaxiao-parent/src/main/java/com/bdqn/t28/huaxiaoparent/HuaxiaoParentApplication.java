package com.bdqn.t28.huaxiaoparent;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.bdqn.t28.huaxiaoparent.dao")
@SpringBootApplication
public class HuaxiaoParentApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuaxiaoParentApplication.class, args);
    }

}
