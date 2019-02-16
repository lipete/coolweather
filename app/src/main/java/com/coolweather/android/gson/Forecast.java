package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author PeterLi
 * Created at 2019/2/15 08:49
 * Notes：天气预测：  日期  温度：最大 最小  更多：信息
 */
public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }

}
