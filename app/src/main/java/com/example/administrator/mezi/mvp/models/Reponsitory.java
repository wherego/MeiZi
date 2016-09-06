package com.example.administrator.mezi.mvp.models;


import java.util.List;

import rx.Observable;

/**
 * Description: $content
 *  请求的库
 * @author: zhangmin
 * @date: 2016/09/02 14:26
 */
public interface Reponsitory {
    Observable<List<MeiZi>> getMeiziData(int offset);
}
