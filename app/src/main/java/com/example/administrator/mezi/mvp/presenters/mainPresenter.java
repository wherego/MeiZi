package com.example.administrator.mezi.mvp.presenters;

import com.example.administrator.mezi.mvp.models.MeiZi;
import com.example.administrator.mezi.mvp.models.Reponsitory;
import com.example.administrator.mezi.mvp.ui.BaseView;
import com.example.administrator.mezi.mvp.ui.MainView;

import java.util.List;

import javax.inject.Inject;

import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Description: $content
 *
 * @author: zhangmin
 * @date: 2016/09/02 14:31
 */
public class mainPresenter implements BasePresenter {
    private MainView mainView; //主页视图
    private Reponsitory reponsitory; //数据源
    private Subscription mMeiziSubscription; // 订阅成员


    @Inject
    public mainPresenter(Reponsitory reponsitory) {
        this.reponsitory = reponsitory;
    }

    @Override
    public void onCreate() {
        //加载数据
        loadData();
    }

    private void loadData() {
        mMeiziSubscription = reponsitory.getMeiziData(1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<List<MeiZi>>() {
                    @Override
                    public void call(List<MeiZi> meiZis) {
                        mainView.setListData(meiZis);
                    }
                });
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onStop() {
        mMeiziSubscription.unsubscribe();

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void attachView(BaseView v) {
        mainView = (MainView) v;
    }
}
