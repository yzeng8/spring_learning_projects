package com.yonyou;

import com.yonyou.config.SpringConfig;
import com.yonyou.pojo.Student;
import com.yonyou.service.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        StudentService studentService = (StudentService) ctx.getBean(StudentService.class);
//        List<Student> students = studentService.selectAll();
//        System.out.println(students);

 //       System.out.println(studentService.selectById(298));

        Student student = new Student();
        student.setStudentName("ryan");
        student.setSex("M");
        student.setStudentId(new Integer(1647133));
//        studentService.insert(student);


//        student.setStudentName("Ryan");
//        //student.setSex("M");
//        studentService.update(student);

    }
}
