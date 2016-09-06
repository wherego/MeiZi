package com.example.administrator.mezi.networks.services;


import com.example.administrator.mezi.mvp.models.MeiZi;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Description: $content
 *
 * @author: zhangmin
 * @date: 2016/09/02 14:18
 */
public interface MeiziService {
    String END_POINT = "http://gank.io/api/data/";
    String PARAM_API_KEY = "apikey";
    String PARAM_HASH = "hash";
    String PARAM_TIMESTAMP = "ts";

    @GET("福利/" + 10 + "/{page}")
    Observable<List<MeiZi>> getMeiziData(@Query("offset") int offset);

}
