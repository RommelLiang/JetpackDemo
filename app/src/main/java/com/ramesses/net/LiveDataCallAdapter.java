/*
 * Copyright (c) KYE 2019, All Rights Reserved
 */

package com.ramesses.net;

import android.arch.lifecycle.LiveData;

import java.lang.reflect.Type;

import retrofit2.Call;
import retrofit2.CallAdapter;

/**
 * Routing
 * Desc    TODO
 * Source
 * Created by LWS on 2019-09-03 19:42
 * Version 1.0
 */
public class LiveDataCallAdapter<T> implements CallAdapter<T, LiveData<BaseResponse<T>>> {
    private Type responseType;

    public LiveDataCallAdapter(Type responseType) {

        this.responseType = responseType;
    }

    @Override
    public Type responseType() {

        return responseType;
    }

    @Override
    public LiveData<BaseResponse<T>> adapt(Call<T> call) {

        return null;
    }
}
