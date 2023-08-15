package com.example.gc.model;
import com.google.gson.annotations.SerializedName;
public class register {
    @SerializedName("customer_id")
    public Integer customer_id;
    @SerializedName("username")
    public String username;
    @SerializedName(" email")
    public String  email;
    @SerializedName("password")
    public String password;

    @SerializedName("mobile")
    public Integer mobile;

    public register(Integer customer_id, String username,String email,String password,Integer mobile) {
        this.customer_id = customer_id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.mobile = mobile;
    }

}
