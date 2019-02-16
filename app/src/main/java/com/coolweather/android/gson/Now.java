package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author PeterLi
 * Created at 2019/2/14 17:44
 * Notes：现在： 温度   更多：信息
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
