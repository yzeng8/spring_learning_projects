package com.yonyou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//2.定义controller，用@controller来定义bean
@Controller
public class UserController {

    //2.2.设置当前操作的访问路径
    @RequestMapping("/save")
    //2.3 设置返回值类型
    @ResponseBody
    public String save(){
        System.out.println("user save ...");
        return "{'module':'springmvc!!!'}"; // return一个json数据(字符串)，打印一个键值对
    }

    @RequestMapping("/delete")
    //2.3 设置返回值类型
    @ResponseBody
    public String delete(){
        System.out.println("user delete ...");
        return "{'module':'springmvc delete!!!'}"; // return一个json数据(字符串)，打印一个键值对
    }

}
