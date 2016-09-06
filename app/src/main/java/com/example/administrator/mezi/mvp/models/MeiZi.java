package com.example.administrator.mezi.mvp.models;

/**
 * Description: $content
 *
 * @author: zhangmin
 * @date: 2016/09/02 14:23
 */
public class MeiZi {

    /**
     * _id : 57c6dcd0421aa9125fa3edc5
     * createdAt : 2016-08-31T21:34:08.961Z
     * desc : 9-1
     * publishedAt : 2016-09-01T11:31:19.288Z
     * source : chrome
     * type : 福利
     * url : http://ww3.sinaimg.cn/large/610dc034jw1f7d97id9mbj20u00u0q4g.jpg
     * used : true
     * who : daimajia
     */

    private String _id;
    private String createdAt;
    private String desc;
    private String publishedAt;
    private String source;
    private String type;
    private String url;
    private boolean used;
    private String who;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }
}
