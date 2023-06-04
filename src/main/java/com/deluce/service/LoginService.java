package com.deluce.service;

import com.deluce.entity.Employees;
import com.deluce.mapper.LoginMapper;
import com.deluce.service.impl.LoginServiceImpl;
import com.deluce.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class LoginService implements LoginServiceImpl {
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    LoginMapper mapper = sqlSession.getMapper(LoginMapper.class);

    @Override
    public boolean login(String username, String password) {
        Employees employees = mapper.login(username, password);
        if (employees != null) {
            System.out.println("欢迎" + employees.getUsername());
            return true;
        } else {
            System.out.println("User not found.");
            return false;
        }
    }

    public Employees getEmployee(String username, String password){
        return mapper.login(username, password);
    }
}
