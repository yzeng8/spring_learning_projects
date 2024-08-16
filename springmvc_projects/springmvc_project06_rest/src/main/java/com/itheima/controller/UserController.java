package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Controller
//@ResponseBody  合并为RestController
@RestController
@RequestMapping("/users") //提取所有公共名称
public class UserController {

    //@RequestMapping(value = "/users",method = RequestMethod.POST)
    @PostMapping()//== @RequestMapping(method = RequestMethod.POST)
    public String save(@RequestBody User user) {
        System.out.println("user insert... user -->" + user);
        return "{'module':'user save'}";
    }

    //@RequestMapping(value = "/users",method = RequestMethod.PUT)
    @PutMapping
    public String update(@RequestBody User user) {
        System.out.println("user update... user -->"+ user);
        return "{'module':'user update'}";
    }

    //@RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        System.out.println("user delete...id: "+id);

        return "{'module':'user delete'}";
    }

    //@RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
    @GetMapping("/{id}")
    public String getbyId(@PathVariable int id){
        System.out.println("user getbyId...id" + id);
        return "{'module':'user getbyId'}";
    }
}
