package com.deluce.mapper;

import org.apache.ibatis.annotations.Insert;

public interface NewRequestReportMapper {

    @Insert("insert into emergencymaintenances (ID, AssetID, PriorityID, DescriptionEmergency, OtherConsiderations, EMReportDate, EMStartDate) " + "values (4, 2, #{PriorityID}, #{DescriptionEmergency}, #{OtherConsiderations}, '2023-06-04', '2023-06-05')")
    int insertEM();
}
