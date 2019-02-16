package com.coolweather.android.gson;

/**
 * @author PeterLi
 * Created at 2019/2/14 17:40
 * Notes：空气指数
 */
public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
