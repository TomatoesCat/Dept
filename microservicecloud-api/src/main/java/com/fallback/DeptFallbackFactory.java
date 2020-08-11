package com.fallback;

import com.dept.feign.FeignService;
import com.dept.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class DeptFallbackFactory implements FallbackFactory<FeignService> {
    @Override
    public FeignService create(Throwable throwable) {
        return new FeignService() {
            @Override
            public Dept find(long id) {
                Dept dept=new Dept(null,"不存在",null);
                return dept;
            }

            @Override
            public List<Dept> findAll() {
                return null;
            }

            @Override
            public String add(Dept dept) {
                return null;
            }
        };
    }
}
