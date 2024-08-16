package com.yonyou.controller;

import com.yonyou.dao.UserDao;
import com.yonyou.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController()
@RequestMapping("/tblusers")
public class UserController {
    @Autowired
    UserDao userdao;

    @GetMapping
    public List<User> getUser() {
        return userdao.selectAll();
    }


}
