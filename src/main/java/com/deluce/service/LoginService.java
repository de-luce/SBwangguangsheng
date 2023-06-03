package com.deluce.service;

import com.deluce.entity.Employees;
import com.deluce.mapper.LoginMapper;
import com.deluce.service.impl.LoginServiceImpl;
import com.deluce.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class LoginService implements LoginServiceImpl {
    String username = null;
    String password = null;
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    LoginMapper mapper = sqlSession.getMapper(LoginMapper.class);
    boolean ifUsername = false;

    @Override
    public String ifUsername(String username) {
        Employees employees = mapper.ifUsername(username);
        if (employees != null) {
            ifUsername = true;
        } else {
            System.out.println("User not found.");
        }
        sqlSession.close();
        return username;
    }

    @Override
    public boolean login(String username, String password) {
        if (ifUsername) {
            Employees employees = mapper.login(ifUsername(username), password);

        }
        return false;
    }


}
