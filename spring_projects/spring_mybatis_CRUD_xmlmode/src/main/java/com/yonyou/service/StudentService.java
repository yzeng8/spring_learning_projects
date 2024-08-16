package com.yonyou.service;

import com.yonyou.pojo.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
    public List<Student> selectAll();
    public Student selectById(Integer Id);
    public int insert(Student student);
    public int update(Student student);
}
