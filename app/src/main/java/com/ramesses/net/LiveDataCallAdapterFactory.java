/*
 * Copyright (c) KYE 2019, All Rights Reserved
 */

package com.ramesses.net;

import android.arch.lifecycle.LiveData;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import retrofit2.CallAdapter;
import retrofit2.Retrofit;

/**
 * Routing
 * Desc    TODO
 * Source
 * Created by LWS on 2019-09-03 19:33
 * Version 1.0
 */
public class LiveDataCallAdapterFactory extends CallAdapter.Factory {


    @Override
    public CallAdapter<?, ?> get(
            Type returnType, Annotation[] annotations, Retrofit retrofit) {
        if (CallAdapter.Factory.getRawType(returnType) != LiveData.class) {
            return  null;
        }
        Type parameterUpperBound =
                CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType)returnType);
        Class<?> rawType = CallAdapter.Factory.getRawType(parameterUpperBound);
        if (rawType != BaseResponse.class){
            throw new IllegalArgumentException("类型必须为BaseResponse");
        }
        if (!(parameterUpperBound instanceof ParameterizedType)){
            throw new IllegalArgumentException("资源必须为ParameterizedType");
        }
        Gson gson = new GsonBuilder().create();
        return new LiveDataCallAdapter(parameterUpperBound,gson);
    }
}
