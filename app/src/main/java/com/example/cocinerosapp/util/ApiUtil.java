package com.example.cocinerosapp.util;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtil
{
    private final static String URL_BASE = "https://sgp-unibague.herokuapp.com/v1/";

    public static Retrofit obtenerRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(URL_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
