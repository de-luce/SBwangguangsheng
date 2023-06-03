package com.deluce.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * (Employees)实体类
 *
 * @author makejava
 * @since 2023-06-02 19:32:52
 */
@Data
@TableName("session2.employees")
public class Employees {
    private Long id;
    private String firstname;
    private String lastname;
    private String phone;
    private Integer isadmin;
    private String username;
    private String password;
}

