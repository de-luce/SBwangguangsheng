package com.deluce.service.impl;

public interface SendEMRequestServiceImpl {
    void selectByUsername(String username, String assetSN);

    void insertReport(String DescriptionEmergency, String OtherConsiderations, String priorityID, String AssetSN);
}
