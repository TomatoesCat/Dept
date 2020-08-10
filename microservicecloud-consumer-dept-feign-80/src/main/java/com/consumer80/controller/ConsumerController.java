package com.consumer80.controller;

import com.dept.feign.FeignService;
import com.dept.pojo.Dept;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ConsumerController {
    Logger logger= LoggerFactory.getLogger(getClass());
    @Autowired
    private FeignService feignService=null;
    //RestTemplate restTemplate;
    //private static final String RES_URL_PREFIX="http://localhost:8001";
    //private static final String RES_URL_PREFIX="http://microservicecloud-dept";
    @RequestMapping("/list")
    public List<Dept> listAll(){
        return feignService.findAll();
    }
    @RequestMapping(value="/add",method = RequestMethod.POST)
    public String add(Dept dept){
        logger.info(dept.toString());
        //return restTemplate.getForObject(RES_URL_PREFIX+"/add",String.class,dept);
        //return restTemplate.postForObject(RES_URL_PREFIX+"/add",dept,String.class);
        return feignService.add(dept);
    }
}
