package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */@SpringBootApplication
@EnableEurekaServer
public class App7002
{
    public static void main( String[] args )
    {
        SpringApplication.run(App7002.class,args);
        System.out.println( "Hello World!" );
    }
}
