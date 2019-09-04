/*
 * Copyright (c) KYE 2019, All Rights Reserved
 */

package com.ramesses.net;

import android.arch.lifecycle.LiveData;

import com.ramesses.jetpackdemo.bean.User;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Routing
 * Desc    TODO
 * Source
 * Created by LWS on 2019-09-03 19:19
 * Version 1.0
 */
public class ApiService {

    private ApiManagerService mApiManagerService;

    private final String ENDPOINT = "https://www.apiopen.top/";
    private static class StaticSingletonHolder {

        private static final ApiService instance = new ApiService();
    }

    private ApiService() {

        OkHttpClient httpClient = new OkHttpClient.Builder()
                .connectTimeout(4, TimeUnit.SECONDS).build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ENDPOINT)
                .addCallAdapterFactory(new LiveDataCallAdapterFactory())
                .client(httpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        mApiManagerService = retrofit.create(ApiManagerService.class);
    }

    public static ApiManagerService getInstance() {

        return StaticSingletonHolder.instance.mApiManagerService;
    }


    public interface ApiManagerService {
        @GET("/login")
        LiveData<BaseResponse<User>> login(@Query ("key") String key, @Query ("phone") String phone,
                                           @Query ("passwd") String passwd);
    }

}
