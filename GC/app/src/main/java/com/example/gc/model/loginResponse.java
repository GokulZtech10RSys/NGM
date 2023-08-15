package com.example.gc.model;
import com.google.gson.annotations.SerializedName;
public class loginResponse {
    @SerializedName("userName")
    public String userName;
    @SerializedName("boolean")
    public Boolean bool;
    @SerializedName("status_code")
    public Integer status_code;
    @SerializedName("message")
    public String message;
}
