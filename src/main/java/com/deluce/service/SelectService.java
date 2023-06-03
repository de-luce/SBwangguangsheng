package com.deluce.service;

import com.deluce.entity.Employees;
import com.deluce.entity.SelectEM;
import com.deluce.mapper.LoginMapper;
import com.deluce.mapper.SelectMapper;
import com.deluce.service.impl.SelectServiceImpl;
import com.deluce.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class SelectService implements SelectServiceImpl {
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

    public void SelectEM(){
        List<SelectEM> result = mapper.selectEM();
        for (SelectEM em : result) {
            System.out.println(em.getAssetSN() + ", " + em.getAssetName() + ", " + em.getLastClosedEM() + ", " + em.getNumberOfEMs());
        }
    }
}
