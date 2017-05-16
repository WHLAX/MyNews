package com.bawei.mynews;

/**
 * Created by 王浩雷 on 2017/5/16.
 */
public interface LoginModel {
    void login(String username, String password, OnLoginFinishedListener listener);
}
