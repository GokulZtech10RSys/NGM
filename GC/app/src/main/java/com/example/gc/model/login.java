package com.example.gc.model;

import com.google.gson.annotations.SerializedName;

public class login {
    @SerializedName("mobile")
    public Integer mobile;
    @SerializedName("password")
    public String password;

    public login(Integer mobile, String password) {
        this.mobile = mobile;
        this.password = password;
    }


}
