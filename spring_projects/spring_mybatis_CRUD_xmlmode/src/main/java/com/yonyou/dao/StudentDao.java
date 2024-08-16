package com.yonyou.dao;

import com.yonyou.pojo.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao {
    public Student selectById(Integer id);

//    @Select("SELECT * FROM student_id")
//    @Results({
//            @Result(property = "studentId", column = "Student_Id"),
//            @Result(property = "studentName", column = "Student_Name")
//    })
    public List<Student> selectAll();

    public int insert(Student student);

    public int update(Student student);

}
