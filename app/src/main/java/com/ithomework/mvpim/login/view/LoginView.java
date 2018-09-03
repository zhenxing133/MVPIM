package com.ithomework.mvpim.login.view;


import com.ithomework.mvpim.base.BaseMvpView;
import com.ithomework.mvpim.login.model.LoginBean;

/**
 * Created by yuan.zhen.xing on 2018-08-14.
 */

public interface LoginView extends BaseMvpView {

    //有数据显示数据
    void showResult(LoginBean loginBean);

    //Toast
    void showToast(String msg);

    //页面切换
    void startPage();
}
