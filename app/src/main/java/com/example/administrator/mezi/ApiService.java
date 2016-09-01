package com.example.administrator.mezi;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Description:
 *
 * @author: zhangmin
 * @date: 2016/8/31 21:24
 */
public interface ApiService {
    @GET("福利/" + 10 + "/{page}")
    Call<Json> getDataList(@Path("page") String page);


}
