package com.example.administrator.mezi;

/**
 * Description: $content
 *
 * @author: zhangmin
 * @date: 2016/08/31 16:36
 */
public class MeiZi {
    public String ImageUrl;
    public String Summary;

    public MeiZi(String imageUrl, String summary) {
        ImageUrl = imageUrl;
        Summary = summary;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String summary) {
        Summary = summary;
    }
}
