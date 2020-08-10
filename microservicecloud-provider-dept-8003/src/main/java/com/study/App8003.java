package com.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.dept.deptDao")
@EnableEurekaClient
@ComponentScan({"com.dept.service","com.dept.controller"})
public class App8003
{
    public static void main( String[] args )
    {
        SpringApplication.run(App8003.class,args);System.out.println( "Hello World!" );
    }
}
