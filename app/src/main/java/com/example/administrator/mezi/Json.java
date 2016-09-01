package com.example.administrator.mezi;

import java.util.List;

/**
 * Description:
 *
 * @author: zhangmin
 * @date: 2016/9/1 22:24
 */
public class Json {

    /**
     * error : false
     * results : [{"_id":"57c6dcd0421aa9125fa3edc5","createdAt":"2016-08-31T21:34:08.961Z","desc":"9-1","publishedAt":"2016-09-01T11:31:19.288Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034jw1f7d97id9mbj20u00u0q4g.jpg","used":true,"who":"daimajia"},{"_id":"57c6265c421aa9125d96f53c","createdAt":"2016-08-31T08:35:40.27Z","desc":"8-31","publishedAt":"2016-08-31T11:41:56.41Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f7cmpd95iaj20u011hjtt.jpg","used":true,"who":"代码家"},{"_id":"57c4fd22421aa9125fa3edb5","createdAt":"2016-08-30T11:27:30.559Z","desc":"8-30","publishedAt":"2016-08-30T11:38:36.625Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/610dc034gw1f7bm1unn17j20u00u00wm.jpg","used":true,"who":"代码家"},{"_id":"57c2e9f1421aa91265f4a3ee","createdAt":"2016-08-28T21:41:05.165Z","desc":"8-29","publishedAt":"2016-08-29T11:32:28.388Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/610dc034jw1f79sjqjn11j20u011hmzv.jpg","used":true,"who":"daimajia"},{"_id":"57beef67421aa91265f4a3dd","createdAt":"2016-08-25T21:15:19.562Z","desc":"8-26","publishedAt":"2016-08-26T11:39:18.8Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f76axy6xcsj20u00yqq49.jpg","used":true,"who":"daimajia"},{"_id":"57bdaa89421aa9125d96f4fe","createdAt":"2016-08-24T22:09:13.461Z","desc":"8-25","publishedAt":"2016-08-25T11:23:14.243Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034jw1f756vb8zl2j20u011haec.jpg","used":true,"who":"代码家"},{"_id":"57bc5238421aa9125fa3ed70","createdAt":"2016-08-23T21:40:08.159Z","desc":"8.24","publishedAt":"2016-08-24T11:38:48.733Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034jw1f740f701gqj20u011hgo9.jpg","used":true,"who":"daimajia"},{"_id":"57bb039e421aa9125fa3ed5e","createdAt":"2016-08-22T21:52:30.572Z","desc":"8-22","publishedAt":"2016-08-23T11:29:45.813Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/610dc034jw1f72v5ra09fj20u011hdit.jpg","used":true,"who":"代码家"},{"_id":"57b93f9e421aa950cf8050ff","createdAt":"2016-08-21T13:43:58.241Z","desc":"8-22","publishedAt":"2016-08-22T11:29:37.164Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034jw1f71bezmt3tj20u00k0757.jpg","used":true,"who":"代码家"},{"_id":"57b64b6d421aa93a804bea26","createdAt":"2016-08-19T07:57:33.576Z","desc":"8-19","publishedAt":"2016-08-19T11:26:30.163Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f6yq5xrdofj20u00u0aby.jpg","used":true,"who":"daimajia"}]
     */

    public boolean error;
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

    public List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        public String _id;
        public String createdAt;
        public String desc;
        public String publishedAt;
        public String source;
        public String type;
        public String url;
        public boolean used;
        public String who;
    }
}
