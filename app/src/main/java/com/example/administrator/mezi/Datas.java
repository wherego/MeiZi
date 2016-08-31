package com.example.administrator.mezi;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: $content
 *
 * @author: zhangmin
 * @date: 2016/08/31 16:50
 */
public class Datas {
    public static List<MeiZi> getData(int dx) {
        List<MeiZi> meiZis = new ArrayList<>();
        MeiZi meiZi;
        for (int i = 0; i < 10; i++) {
            meiZi = new MeiZi("url.000" + i, "这个是第" + (i + dx) + "个妹子简介");
            meiZis.add(meiZi);
        }
        return meiZis;
    }
}
