package com.arsenal.serviceribbon.controller;

import com.arsenal.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 负载均衡的工作原理
 *   1.一个服务注册中心，eureka server,端口为8761
 *   2.eureka-client工程运行两个实例，端口分别为8762,8763，分别向服务注册中心注册
 *   3.sercvice-ribbon端口为8764,向服务注册中心注册
 *   4.当sercvice-ribbon通过restTemplate调用eureka-client的clientTest接口时，
 *     因为用ribbon进行了负载均衡，会轮流的调用eureka-client：8762和8763 两个端口的clientTest接口；
 * @Date: 2018/9/5 19:55
 */
@RestController
public class RibbonControler {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/ribbonHi")
    public String meiGuiHi(@RequestParam String name){
        return helloService.hiService(name);
    }

}
