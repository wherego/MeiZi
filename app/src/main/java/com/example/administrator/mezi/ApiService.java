package com.example.administrator.mezi;


import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Description:
 *
 * @author: zhangmin
 * @date: 2016/8/31 21:24
 */
public interface ApiService {
    @GET("/data/福利/" + 10 + "/{page}")
    Call<Object> getDataList(@Path("page") int page);
}
