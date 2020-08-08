package com.example.cocinerosapp.data.preferences;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesManager {

    private final static String NOMBRE_PREFERENCIAS = "MESAPP-PREFERENCES";
    private final static String KEY_AUTH_TOKEN = "authToken";

    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    public SharedPreferencesManager(Context context) {
        preferences = context.getSharedPreferences(NOMBRE_PREFERENCIAS, Context.MODE_PRIVATE);
        editor = preferences.edit();
    }

    public String getAuthToken() {
        return preferences.getString(KEY_AUTH_TOKEN, "0");
    }

    public void setAuthToken(String authToken) {
        editor.putString(KEY_AUTH_TOKEN, authToken);
        editor.apply();
    }

}
