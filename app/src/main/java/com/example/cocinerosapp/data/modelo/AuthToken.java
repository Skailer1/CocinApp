package com.example.cocinerosapp.data.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AuthToken {

    @SerializedName("authToken")
    @Expose
    private String authToken;

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }
}
