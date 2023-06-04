package com.deluce.service.impl;

public interface SendEMRequestServiceImpl {
    void selectByUsername(String username,String assetSN);

    int insertReport();
}
