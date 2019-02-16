package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author PeterLi
 * Created at 2019/2/15 09:16
 * Notes：创建一个总的实例类来引用刚刚的各个实体类
 */
public class Weather {

    public String status;   //状态

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
