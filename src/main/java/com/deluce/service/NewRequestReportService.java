package com.deluce.service;

import com.deluce.mapper.NewRequestReportMapper;
import com.deluce.service.impl.NewRequestReportServiceImpl;
import com.deluce.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class NewRequestReportService implements NewRequestReportServiceImpl {
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    NewRequestReportMapper mapper = sqlSession.getMapper(NewRequestReportMapper.class);

    @Override
    public int insertEM() {
        int i = mapper.insertEM();
        System.out.println(i);
        return i;
    }
}
