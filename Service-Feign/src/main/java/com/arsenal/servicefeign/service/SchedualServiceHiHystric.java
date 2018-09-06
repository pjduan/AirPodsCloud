package com.arsenal.servicefeign.service;

import com.arsenal.servicefeign.inter.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * SchedualServiceHiHystric需要实现SchedualServiceHi 接口,
 * 并注入到Ioc容器中
 * @Date: 2018/9/6 16:19
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    /** 重写 sayHiFromClient 的方法 */
    @Override
    public String sayHiFromClient(String name) {
        return "sorry "+name;
    }
}
