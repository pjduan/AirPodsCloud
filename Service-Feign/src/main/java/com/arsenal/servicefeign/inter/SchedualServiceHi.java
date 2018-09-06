package com.arsenal.servicefeign.inter;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @FeignClient的value属性:
 *  对应调用服务实例的spring.application.name,也就是服务生产者的名称
 *  Eureka-Client工程中的application.yml
 */
@Service
@FeignClient(value="eureka-client")
public interface SchedualServiceHi {

    /**
     * @RequestMapping的value属性:
     *     对应调用服务实例中的方法名
     *     本案例调用的是 ClientController.clientTest()
     */
    @RequestMapping(value = "/clientTest",method = RequestMethod.GET)
    String sayHiFromClient(@RequestParam(value = "miAir") String name);
}
