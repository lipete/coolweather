package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author PeterLi
 * Created at 2019/2/14 18:00
 * Notes：建议: 舒适 洗车 运动
 */
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }

}
