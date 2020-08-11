package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan({"com.consumer80.controller","com.fallback"})
@EnableEurekaClient
@EnableFeignClients("com.dept.feign")
public class Feign80
{
    public static void main( String[] args )
    {
        SpringApplication.run(Feign80.class,args);
        System.out.println( "Hello World!" );
    }
}
