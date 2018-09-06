package com.arsenal.servicefeign.controller;

import com.arsenal.servicefeign.inter.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Feign的工作原理参照 RibbonController负载均衡
 * @Date: 2018/9/6 14:44
 */
@RestController
public class FeignController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClient( name );
    }
}
