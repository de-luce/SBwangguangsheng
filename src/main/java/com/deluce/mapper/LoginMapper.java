package com.deluce.mapper;

import com.deluce.entity.Employees;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {
    @Select("SELECT * FROM employees WHERE Username = #{username}")
    Employees ifUsername(@Param("username") String username);

    @Select("SELECT * FROM employees WHERE Username = #{username} and Password = #{password}")
    Employees login(@Param("username") String username, @Param("password") String password);


    //@Select("select * from session2.employees where Username=#{username}")
    //Employees selectByUsername(String username);
}
