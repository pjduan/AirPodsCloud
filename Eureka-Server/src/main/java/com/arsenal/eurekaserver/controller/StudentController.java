package com.arsenal.eurekaserver.controller;

import com.arsenal.eurekaserver.inter.StudentRepository;
import com.arsenal.eurekaserver.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 * @Auther: Pjduan
 * @Date: 2018/9/26 16:06
 */
@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    private final static Logger logger = LoggerFactory.getLogger(StudentController.class);

    @GetMapping("/getAllStudent")
    public List<Student> getAllStudent() {
        logger.info("master");
        logger.info("duandachui");
        logger.info("访问getAllStudent方法");
        return studentRepository.findAll();
    }
}