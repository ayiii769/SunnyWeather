package com.example.sunnyweather.logic.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class DailyResponse {
    public DailyResponse.Result result;
    public String status;

    public static  class Result {
        public DailyResponse.Daily daily;

    }

    public static class Temperature{
        public Float max;
        public Float min;
    }

    public static class Skycon{
        public String value;
        public Date date;
    }

    public static class LifeIndex{
        public List<LifeDescription> coldRisk;
        public LifeDescription carWashing;
        public LifeDescription ultraviolet;
        public LifeDescription dressing;
    }
    public static class LifeDescription{
        public String desc;
    }

    public static class Daily{
        public List<Skycon> skycon;
        public List<Temperature> temperature;
        @SerializedName("life_index")
        public LifeIndex lifeIndex;

    }
}
