package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * @author PeterLi
 * Created at 2019/2/13 17:35
 * Notes：
 */
public class Province extends DataSupport {
    private int id;
    private String provinceName;    //省份名字
    private int provinceCode;   //省份代码

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
