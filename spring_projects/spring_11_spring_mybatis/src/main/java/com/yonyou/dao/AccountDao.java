package com.yonyou.dao;

import com.yonyou.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Delete;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {
    @Insert("INSERT INTO tbl_account(name, money) VALUES(#{name}, #{money})")
    void save(Account account);

    @Delete("DELETE FROM tbl_account WHERE id = #{id}")
    void delete(Integer id);

    @Update("UPDATE tbl_account SET name = #{name}, money = #{money} WHERE id = #{id}")
    void update(Account account);

    @Select("SELECT * FROM tbl_account")
    List<Account> findAll();

    @Select("SELECT * FROM tbl_account WHERE id = #{id}")
    Account findById(Integer id);
}
