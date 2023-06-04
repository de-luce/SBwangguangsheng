package com.deluce.entity;

import lombok.Data;

import java.util.Date;

@Data
public class SelectEM {
    private String assetSN;
    private String assetName;
    private Date lastClosedEM;
    private String department;
    private int numberOfEMs;
}
