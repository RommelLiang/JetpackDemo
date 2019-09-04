/*
 * Copyright (c) KYE 2019, All Rights Reserved
 */

package com.ramesses.net;

import android.arch.lifecycle.LiveData;

import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;

import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Routing
 * Desc    TODO
 * Source
 * Created by LWS on 2019-09-03 19:42
 * Version 1.0
 */
public class LiveDataCallAdapter<T>
        implements CallAdapter<BaseResponse, LiveData<BaseResponse<T>>> {

    private Type responseType;
    private Gson mGson;

    public LiveDataCallAdapter(Type responseType, Gson mGson) {

        this.responseType = responseType;
        this.mGson = mGson;
    }

    @Override
    public Type responseType() {

        return responseType;
    }

    @Override
    public LiveData<BaseResponse<T>> adapt(final Call<BaseResponse> call) {

        return new LiveData<BaseResponse<T>>() {

            AtomicBoolean atomicBoolean = new AtomicBoolean(false);

            @Override
            protected void onActive() {

                super.onActive();
                if (atomicBoolean.compareAndSet(false, true)) {
                    call.enqueue(new Callback<BaseResponse>() {

                        @Override
                        public void onResponse(
                                Call<BaseResponse> call, Response<BaseResponse> response) {

                            postValue(ConvertFactory.convert(response, mGson));
                        }

                        @Override
                        public void onFailure(Call<BaseResponse> call, Throwable t) {

                            postValue(ConvertFactory.convertErroe(t));
                        }
                    });
                }
            }
        };
    }
}
