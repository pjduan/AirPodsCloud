package com.arsenal.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: Pjduan
 * @Date: 2018/9/5 19:51
 */
@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;

    /**
     * @HystrixCommand
     *      该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法
     * @createtime 2018/9/6 15:58
     */
    @HystrixCommand(fallbackMethod = "errorString")
    public String hiService(String name){
        return restTemplate.getForObject("http://EUREKA-CLIENT/clientTest?name="+name,String.class);
    }

    /**
     * 熔断方法
    * @createtime 2018/9/6 15:59
    */
    public String errorString(String name){
        return "hi,"+name+",sorry,error!";
    }

}
