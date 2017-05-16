package com.bawei.mynews;

/**
 * Created by 王浩雷 on 2017/5/16.
 */
public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();
}
