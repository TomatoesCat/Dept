package com.dept.controller;

import com.dept.pojo.Dept;
import com.dept.service.DeptService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DeptController {
    Logger logger= LoggerFactory.getLogger(getClass());
    @Autowired
    DeptService deptService;

    @RequestMapping(value = "/find/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Dept find(@PathVariable long id){
        return deptService.findById(id);
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public List<Dept> findAll(){
        return deptService.findAll();
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add(@RequestBody Dept dept){
        logger.info(dept.toString());
        deptService.addDept(dept);
        return "success";
    }
}
