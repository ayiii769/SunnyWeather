package com.example.sunnyweather;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

public class SunnyWeatherApplication extends Application {
    public static final String TOKEN = "BvJ2kEr0rD3xW3Ns";
    @SuppressLint("StaticFieldLeak")
    static public Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();
    }
}
