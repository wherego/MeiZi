package com.example.administrator.mezi;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Description: $content
 *
 * @author: zhangmin
 * @date: 2016/08/31 16:06
 */
public class MianAdapter extends RecyclerView.Adapter<MianAdapter.MainViewHolder> {

    private Context context;
    private List<MeiZi> data_list;

    public MianAdapter(Context context, List<MeiZi> data_list) {
        this.context = context;
        this.data_list = data_list;
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_main_meizi, parent, false);
        return new MainViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {
        MeiZi meiZi = data_list.get(position);
        holder.tv_mian_item_describe.setText(meiZi.getSummary());
        holder.iv_mian_item_meizi.setBackgroundColor(Color.GREEN);
    }

    @Override
    public int getItemCount() {
        return data_list.size();
    }


    public class MainViewHolder extends RecyclerView.ViewHolder {
        TextView tv_mian_item_describe;
        ImageView iv_mian_item_meizi;

        public MainViewHolder(View itemView) {
            super(itemView);
            tv_mian_item_describe = (TextView) itemView.findViewById(R.id.tv_mian_item_describe);
            iv_mian_item_meizi = (ImageView) itemView.findViewById(R.id.iv_mian_item_meizi);
        }
    }
}
