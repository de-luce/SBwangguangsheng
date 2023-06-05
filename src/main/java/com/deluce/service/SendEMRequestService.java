package com.deluce.service;

import com.deluce.entity.SelectEM;
import com.deluce.mapper.SendEMRequestMapper;
import com.deluce.service.impl.SendEMRequestServiceImpl;
import com.deluce.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class SendEMRequestService implements SendEMRequestServiceImpl {
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    SendEMRequestMapper mapper = sqlSession.getMapper(SendEMRequestMapper.class);

    @Override
    public void selectByUsername(String username,String assetSN) {
        SelectEM selectByUsername = mapper.selectByUsername(username,assetSN);
        System.out.println(selectByUsername.getAssetSN()+"      "+selectByUsername.getAssetName()+"         "+selectByUsername.getDepartment());
    }

    @Override
    public void insertReport(String DescriptionEmergency, String OtherConsiderations, String priorityID, String AssetSN) {
        mapper.insertReport(DescriptionEmergency, OtherConsiderations, priorityID, AssetSN);
        sqlSession.commit();
    }


}
