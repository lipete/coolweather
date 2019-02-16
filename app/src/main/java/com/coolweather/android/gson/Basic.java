package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author PeterLi
 * Created at 2019/2/14 17:33
 * Notes：基本类： 城市名字 天气id 更新时间
 * 使用 Gson 解析 json 成对象时默认的是将 json 里对应字段的值解析到 java 对象里对应字段的属性里面。
 * 然后我们经常会遇到我们自己定义的 java 对象里的属性名跟 json 里的字段名是不一样的，
 * 这种情况怎么办呢，这时我们就可以使用   @SerializedName   注解来将对象里的属性跟json里字段对应值匹配起来。
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
