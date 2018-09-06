package com.arsenal.servicefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/** 
* @Title: Feign的服务(Feign默认集成了Ribbon,同样是负载均衡)
* @author duanpj
* @createtime 2018/9/6 14:38
*/
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class ServicefeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicefeignApplication.class, args);
    }
}
