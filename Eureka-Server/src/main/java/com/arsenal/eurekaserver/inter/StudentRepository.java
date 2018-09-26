package com.arsenal.eurekaserver.inter;

import com.arsenal.eurekaserver.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther: Pjduan
 * @Date: 2018/9/26 16:05
 */
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
