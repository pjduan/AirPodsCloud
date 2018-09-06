package com.arsenal.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Pjduan
 * @Date: 2018/9/6 15:14
 */
@RestController
public class ClientController {

    @Value("${server.port}")
    String port;

    /**
     * defaultValue:默认
     * miAir = name
     * http://localhost:8762/clientTest?miAir=wwwww
     * */
    @RequestMapping("/clientTest")
    public String test(@RequestParam(value = "miAir", defaultValue = "Aersenal") String name){
        return "hi " + name + " ,i am from port:" + port;
    }

}
