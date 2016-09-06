package com.example.administrator.mezi.mvp.ui;

import com.example.administrator.mezi.mvp.models.MeiZi;

import java.util.List;

/**
 * 主页的Views
 * <p>
 * Created by wangchenlong on 16/1/21.
 */
public interface MainView extends BaseView {
    void setListData(List<MeiZi> meiZis);
}
