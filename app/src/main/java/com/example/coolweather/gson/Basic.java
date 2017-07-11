package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zkd on 2017/7/11.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Updata update;

    public class Updata{

        @SerializedName("loc")
        public String updateTime;

    }
}
