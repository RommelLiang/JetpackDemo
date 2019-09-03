/*
 * Copyright (c) KYE 2019, All Rights Reserved
 */

package com.ramesses.net;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Routing
 * Desc    TODO
 * Source
 * Created by LWS on 2019-09-03 19:19
 * Version 1.0
 */
public class ApiService {

    private ApiManagerService mApiManagerService;

    private final String ENDPOINT = "";
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

    public static ApiService getInstance() {

        return StaticSingletonHolder.instance;
    }

    interface ApiManagerService {

    }

}
