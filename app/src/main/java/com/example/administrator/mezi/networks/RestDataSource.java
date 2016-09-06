package com.example.administrator.mezi.networks;

import com.example.administrator.mezi.mvp.models.MeiZi;
import com.example.administrator.mezi.mvp.models.Reponsitory;
import com.example.administrator.mezi.networks.deserializers.MeiziResultDeserializer;
import com.example.administrator.mezi.networks.services.MeiziService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.List;

import javax.inject.Inject;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * Description: $content
 *
 * @author: zhangmin
 * @date: 2016/09/02 14:14
 */
public class RestDataSource implements Reponsitory {

    private MeiziService meiziService;

    @Inject
    public RestDataSource() {

        // 在OkHttp3.0中添加差值器
        OkHttpClient client = new OkHttpClient.Builder()
                .build();

        // 返回数据反序列化的过滤处理
        MeiziResultDeserializer deserializer =
                new MeiziResultDeserializer<MeiZi>();

        // 定制的Gson反序列化
        Gson customGsonInstance = new GsonBuilder()
                .registerTypeAdapter(
                        new TypeToken<List<MeiZi>>() {
                        }.getType(),
                        deserializer)
                .create();

        // 添加Host, 添加Gson解析, 添加RxJava适配器, 添加OKHttp.
        Retrofit retrofitAdapter = new Retrofit.Builder()
                .baseUrl(MeiziService.END_POINT)
                .addConverterFactory(GsonConverterFactory.create(customGsonInstance))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build();

        // mMarvelService是服务器接口, marvelApiAdapter是Retrofit对象
        meiziService = retrofitAdapter.create(MeiziService.class);
    }


    @Override
    public Observable<List<MeiZi>> getMeiziData(int offset) {
        // 调用接口, 返回Observable信息
        return  meiziService.getMeiziData(offset);
    }
}
