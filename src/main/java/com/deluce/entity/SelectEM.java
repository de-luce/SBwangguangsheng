package com.deluce.entity;

import lombok.Data;

@Data
public class SelectEM {
    private int assetSNID;
    private String assetSN;
    private String assetName;
    private String lastClosedEM;
    private String department;
    private int numberOfEMs;
}
