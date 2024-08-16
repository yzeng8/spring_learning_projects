package com.yonyou.controller;

import com.yonyou.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/controller")
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
//    public String save(){
//        System.out.println("User access save method ....");
//        return "{'info':'User access save method'}";
//    }
//  接参数的写法
    public String save(String name,int id){
        System.out.println("User access save method ....");
        System.out.println("name -->" + name + ", id -->" +id);
        return "{'info':'User access save method'}";
    }

    @RequestMapping("/listParam4Json")
    @ResponseBody
    public String listParam4Json(@RequestBody List<String> likes){
        System.out.println("参数传递开始");
        System.out.println("list likes -->" + likes);
        return "{'info':'User access save method'}";
    }

    @RequestMapping("/userParam4Json")
    @ResponseBody
    public String userParam4Json(@RequestBody User user){
        System.out.println("实体类参数传递开始");
        System.out.println("user -->" + user);
        return "{'info':'User access save method'}";
    }

    @RequestMapping("/formParam")
    @ResponseBody
    public String formParam(User user){
        System.out.println("表单参数传递开始");
        System.out.println("user -->" + user);
        return "{'info':'User access save method'}";
    }

    @RequestMapping("/dateParam")
    @ResponseBody
    public String dateParam(Date date1, @DateTimeFormat(pattern = "yyyy-MM-dd")Date date2,
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date date3){
        System.out.println("表单参数传递开始");
        System.out.println("date 1 -->" + date1);
        System.out.println("date 2 (yyyy-MM-dd)-->" + date2);
        System.out.println("date 2 (yyyy-MM-dd HH:mm:ss)-->" + date3);
        return "{'info':'User access save method'}";
    }
}
