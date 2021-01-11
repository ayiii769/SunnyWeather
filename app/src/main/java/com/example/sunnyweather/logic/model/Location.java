package com.example.sunnyweather.logic.model;

public class Location {
    String lng;
    String lat;

    public Location(String lng, String lat) {
        this.lng = lng;
        this.lat = lat;
    }
    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

}
