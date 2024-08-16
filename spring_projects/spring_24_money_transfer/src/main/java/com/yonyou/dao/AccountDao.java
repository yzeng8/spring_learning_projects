package com.yonyou.dao;

import com.yonyou.pojo.Account;
import org.apache.ibatis.annotations.Update;


public interface AccountDao {
    @Update("Update tbl_account set money = money + #{money} where name = #{name} ")
    public void inMoney(String name, Integer amount);

    @Update("Update tbl_account set money = money + #{money} where name = #{name} ")
    public void outMoney(String name, Integer amount);
}
