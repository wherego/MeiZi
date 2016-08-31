package com.example.administrator.mezi;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rv_main)
    RecyclerView rv_main;
    @BindView(R.id.srl_main)
    SwipeRefreshLayout srl_main;

    /** 总的数据 */
    private List<MeiZi> data_list = new ArrayList<>();
    private MianAdapter mianAdapter;
    private StaggeredGridLayoutManager staggeredGridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
        initData();
    }

    private void initData() {
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
                List<MeiZi> meiZis = Datas.getData(data_list.size());
                data_list.addAll(meiZis);
                mianAdapter.notifyDataSetChanged();
                srl_main.setRefreshing(false);
            }
        });

        rv_main.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                int[] lastPositions = new int[staggeredGridLayoutManager.getSpanCount()];
                staggeredGridLayoutManager.findLastCompletelyVisibleItemPositions(lastPositions);
                Log.i("zmin....lastPositions.","...." +  lastPositions[0]+"...."+lastPositions[1]);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });

    }

    private void initView() {
    }
}
