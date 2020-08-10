package com.dept.feign;

import com.dept.pojo.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 大小写敏感
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT")
public interface FeignService {
    @RequestMapping(value = "/find/{id}",method = RequestMethod.GET)
    public Dept find(@PathVariable(value = "id") long id);

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<Dept> findAll();

    @RequestMapping(value ="/add",method=RequestMethod.POST)
    public String add(Dept dept);
}
