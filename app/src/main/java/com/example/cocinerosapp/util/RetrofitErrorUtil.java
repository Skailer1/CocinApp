package com.example.cocinerosapp.util;

import com.example.cocinerosapp.data.modelo.BaseResponse;
import com.google.gson.Gson;

import java.util.Objects;

import retrofit2.HttpException;

public class RetrofitErrorUtil {

    public static BaseResponse obtenerRetrofitError(Throwable e) {
        if (e instanceof HttpException) {
            try {
                String body = Objects.requireNonNull(Objects.requireNonNull(((HttpException) e).response()).errorBody()).string();
                return new Gson().fromJson(body, BaseResponse.class);
            } catch (Exception e1) {
                return responseErrorDefault();
            }
        } else {
            return responseErrorDefault();
        }
    }

    private static BaseResponse responseErrorDefault() {
        return new BaseResponse(1, "Ha ocurrido un error, intente mas tarde", false);
    }

}
