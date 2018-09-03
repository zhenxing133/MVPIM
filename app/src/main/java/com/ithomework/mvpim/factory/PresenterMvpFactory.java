package com.ithomework.mvpim.factory;


import com.ithomework.mvpim.base.BaseMvpPresenter;
import com.ithomework.mvpim.base.BaseMvpView;

/**
 * @date 2018/05/22
 * @description Presenter工厂接口
 */
public interface PresenterMvpFactory<V extends BaseMvpView,P extends BaseMvpPresenter<V>> {

    /**
     * 创建Presenter的接口方法
     * @return 需要创建的Presenter
     */
    P createMvpPresenter();
}
