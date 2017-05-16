package com.bawei.mynews;

/**
 * Created by 王浩雷 on 2017/5/16.
 */
public interface LoginView {
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}
