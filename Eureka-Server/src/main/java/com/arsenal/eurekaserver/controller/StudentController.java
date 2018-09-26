package com.arsenal.eurekaserver.controller;

import com.arsenal.eurekaserver.inter.StudentRepository;
import com.arsenal.eurekaserver.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @GetMapping("/getAllStudent")
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}