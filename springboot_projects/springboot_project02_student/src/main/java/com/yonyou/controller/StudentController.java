package com.yonyou.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping("/{id}")
    public String getById(@PathVariable int id) {
        System.out.println("user save.. id : " + id);
        return "hello,springboot";
    }


}
