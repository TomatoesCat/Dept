package com.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.dept.deptDao")
@EnableEurekaClient
@ComponentScan({"com.dept.service","com.dept.controller"})
public class SpringCloudTest {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudTest.class,args);
    }
}
