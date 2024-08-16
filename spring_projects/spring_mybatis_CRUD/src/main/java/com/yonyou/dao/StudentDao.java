package com.yonyou.dao;

import com.yonyou.pojo.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao {
    //public void selectById(String id);

    @Select("SELECT * FROM student_id")
    @Results({
            @Result(property = "studentId", column = "Student_Id"),
            @Result(property = "studentName", column = "Student_Name")
    })
    public List<Student> selectAll();

}
