package com.bawei.mynews;

/**
 * Created by 王浩雷 on 2017/5/16.
 */
public interface OnLoginFinishedListener {

    void onUsernameError();

    void onPasswordError();

    void onSuccess();
}