package com.arsenal.eurekaserver.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Pjduan
 * @Date: 2018/9/11 10:13
 */
@RestController
public class DuanpjDemo {

     @PutMapping("/Arsenalduan")
    public String duanpjTest(){
         return "Duanpj专用测试方法";
     }
}
