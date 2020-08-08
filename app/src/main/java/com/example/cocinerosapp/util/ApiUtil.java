package com.example.cocinerosapp.util;

import com.example.cocinerosapp.data.api.WikiApiService;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtil
{
    private final static String URL_BASE = "https://sgp-unibague.herokuapp.com/";

    private static Retrofit obtenerRetrofit() {
        return new Retrofit.Builder().baseUrl(URL_BASE)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static WikiApiService obtenerWikiApiService() {
        return obtenerRetrofit().create(WikiApiService.class);
    }
}
