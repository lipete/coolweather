package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * @author PeterLi
 * Created at 2019/2/13 17:38
 * Notes：
 */
public class City extends DataSupport {
    private int id;
    private String cityName;     //城市的名字
    private int cityCode;       //城市的代号
    private int provinceId;     //城市所属于的省份id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
