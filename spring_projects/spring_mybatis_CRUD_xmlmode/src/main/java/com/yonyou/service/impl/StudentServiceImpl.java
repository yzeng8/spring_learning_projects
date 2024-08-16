package com.yonyou.service.impl;

import com.yonyou.dao.StudentDao;
import com.yonyou.pojo.Student;
import com.yonyou.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;


    @Override
    public List<Student> selectAll() {

        return studentDao.selectAll();
    }

    @Override
    public Student selectById(Integer Id) {
        return studentDao.selectById(Id);
    }

    @Override
    public int insert(Student student) {
        return studentDao.insert(student);
    }

    @Override
    public int update(Student student) {
        return studentDao.update(student);
    }
}
