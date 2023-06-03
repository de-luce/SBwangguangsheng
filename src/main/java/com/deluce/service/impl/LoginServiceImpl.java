package com.deluce.service.impl;

public interface LoginServiceImpl {
    String ifUsername(String username);

    boolean login(String username, String password);

}
