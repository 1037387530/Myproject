package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountDao {
    //查询所有
    @Select("select * from account")
    public List<Account> findAll();

    //增加
    @Insert("insert into account (name,money) values (#{name},#{money})")
    void  add(Account account);
}
