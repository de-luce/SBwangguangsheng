package com.deluce.mapper;

import com.deluce.entity.SelectEM;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SendEMRequestMapper {
    @Select("SELECT a.AssetSN, a.AssetName,d.Name Department " +
            "FROM assets a " +
            "left join employees em on em.ID = a.EmployeeID " +
            "left join departments d on a.DepartmentLocationID = d.ID " +
            "where em.Username = #{username} and a.AssetSN = #{assetSN} " +
            "group by a.ID")
    SelectEM selectByUsername(@Param("username")String username, @Param("assetSN")String assetSN);

    @Insert("")
    int insertReport();
}
