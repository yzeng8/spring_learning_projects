package com.yonyou.dao;

import com.yonyou.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    public List<User> selectAll();

}
