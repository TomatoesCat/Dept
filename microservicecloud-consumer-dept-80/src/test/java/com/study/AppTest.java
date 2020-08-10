package com.study;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Unit test for simple App.
 */
@EnableEurekaClient
@SpringBootApplication
@ComponentScan({"com.restTemplate","com.consumer80.controller"})
public class AppTest 
{
    public static void main(String[] args) {
        SpringApplication.run(AppTest.class,args);
    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
