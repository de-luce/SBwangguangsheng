package com.deluce.mapper;

import com.deluce.entity.SelectEM;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SelectMapper {
    @Select("SELECT a.AssetSN,a.AssetName,MAX(e.EMEndDate) AS LastClosedEM, COUNT(e.AssetID) AS NumberOfEMs " +
            "FROM assets a " +
            "left join emergencymaintenances e on a.ID = e.AssetID " +
            "group by a.ID")
    List<SelectEM> selectEM();
}
