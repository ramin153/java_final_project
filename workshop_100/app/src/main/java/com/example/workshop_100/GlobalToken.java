package com.example.workshop_100;

import android.app.Application;

public class GlobalToken extends Application {

    private  String Token;

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }
}
