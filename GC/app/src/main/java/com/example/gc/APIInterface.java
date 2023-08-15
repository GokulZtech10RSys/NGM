package com.example.gc;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import java.util.Map;
import retrofit2.http.Query;

import com.example.gc.model.loginResponse;
import com.example.gc.model.register;
import com.example.gc.model.login;
public interface APIInterface {
    @POST("/api/register")
    Call<Map<String,Object>> createUser(@Body register registerdata);
    @POST("/api/login")
    Call<loginResponse> loginUser(@Body login logindata);
}
