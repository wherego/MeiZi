package com.example.administrator.mezi;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rv_main)
    RecyclerView rv_main;
    @BindView(R.id.srl_main)
    SwipeRefreshLayout srl_main;

    /** 总的数据 */
    private List<MeiZi> data_list = new ArrayList<>();
    private MianAdapter mianAdapter;
    private StaggeredGridLayoutManager staggeredGridLayoutManager;

    private Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message message) {
            return false;
        }
    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
        initData();
        getResponseData();
    }

    private void initView() {
    }

    private void initData() {
        data_list = Datas.getData(0);
        mianAdapter = new MianAdapter(this, data_list);
        staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        rv_main.setLayoutManager(staggeredGridLayoutManager);
        rv_main.setAdapter(mianAdapter);
        addListener();
    }

    private void addListener() {
        srl_main.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Log.i("zmin......", "....刷新页面...");
                final List<MeiZi> meiZis = Datas.getData(0);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mianAdapter.addItem(meiZis);
                        srl_main.setRefreshing(false);
                    }
                }, 2000);

            }
        });

        rv_main.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                int[] lastPositions = new int[staggeredGridLayoutManager.getSpanCount()];
                staggeredGridLayoutManager.findLastCompletelyVisibleItemPositions(lastPositions);
                if (lastPositions[1] + 1 == data_list.size() && newState == RecyclerView.SCROLL_STATE_IDLE) {
                    Log.i("zmin......", "....滑动到底部了可以加载更多了...");
                    final List<MeiZi> meiZis = Datas.getData(data_list.size());
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            mianAdapter.addMoreItem(meiZis);
                        }
                    }, 0);
                }

                Log.i("zmin....lastPositions.", "...." + lastPositions[0] + "...." + lastPositions[1]);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacksAndMessages(null);
    }

    public List<MeiZi> getResponseData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://gank.io/")
                .build();
        ApiService apiService = retrofit.create(ApiService.class);
        Call<Object> call = apiService.getDataList(1);
        call.enqueue(new Callback<Object>() {
            @Override
            public void onResponse(Response<Object> response, Retrofit retrofit) {
                Log.i("zmin......", "....成功获取数据...");
            }

            @Override
            public void onFailure(Throwable t) {
                Log.i("zmin......", "....获取数据失败...");
            }

        });


        return null;
    }
}
