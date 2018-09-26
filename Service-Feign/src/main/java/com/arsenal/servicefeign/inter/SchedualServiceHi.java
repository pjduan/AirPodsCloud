package com.arsenal.servicefeign.inter;

import com.arsenal.servicefeign.service.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *  @FeignClient 的value属性:
 *  对应调用服务实例的spring.application.name,也就是服务生产者的名称
 *      (Eureka-Client工程中的application.yml)
 * @createtime 2018/9/6 16:25
 *
 *  @FeignClient 的SchedualServiceHi接口的注解中加上 fallback的指定类就行了
 */
@Service
@FeignClient(value="eureka-client",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    /**
     *   @RequestMapping的value属性:
     *   对应调用服务实例中的方法名
     *   本案例调用的是 ClientController.clientTest()
     * @createtime 2018/9/6 16:25
     */
    @RequestMapping(value = "/clientTest",method = RequestMethod.GET)
    String sayHiFromClient(@RequestParam(value = "miAir") String name);
}
