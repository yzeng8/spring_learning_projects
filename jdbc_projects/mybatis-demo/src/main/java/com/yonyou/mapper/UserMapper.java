package com.yonyou.mapper;

import com.yonyou.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();

    User selectById(int id);
}
