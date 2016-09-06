package com.example.administrator.mezi.mvp.presenters;

import com.example.administrator.mezi.mvp.ui.BaseView;

/**
 * 展示页面
 * <p>
 * Created by wangchenlong on 16/1/21.
 */
@SuppressWarnings("EmptyMethod")
public interface BasePresenter {
    void onCreate();

    void onResume();

    void onStop();

    void onDestroy();

    void attachView(BaseView v);
}
