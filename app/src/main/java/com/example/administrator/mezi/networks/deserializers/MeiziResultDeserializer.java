package com.example.administrator.mezi.networks.deserializers;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Description: $content
 *  反序列化,gson使用.过滤到没有必要的参数
 * @author: zhangmin
 * @date: 2016/09/02 15:56
 */
public class MeiziResultDeserializer<T> implements JsonDeserializer<List<T>>{
    @Override
    public List<T> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        //转换json数据 获取内部有用的信息
        JsonElement results = json.getAsJsonObject().get("results");
        return new Gson().fromJson(results,typeOfT);
    }
}
