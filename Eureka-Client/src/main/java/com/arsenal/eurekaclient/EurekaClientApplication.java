package com.arsenal.eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** 
* @Title: 服务提供者(DUDANPJ)
* @author duanpj
* @createtime 2018/9/5 9:28
*/
@RestController
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    /**
     * defaultValue:默认
     * miAir = name
     * http://localhost:8762/helloDuanpj?miAir=wwwww
     * */
    @RequestMapping("/helloDuanpj")
    public String home(@RequestParam(value = "miAir", defaultValue = "Aersenal") String name){
        return "hi " + name + " ,i am from port:" + port;
    }


}
