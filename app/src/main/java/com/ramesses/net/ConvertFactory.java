/*
 * Copyright (c) KYE 2019, All Rights Reserved
 */

package com.ramesses.net;

import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;

import retrofit2.Response;

/**
 * Routing
 * Desc    TODO
 * Source
 * Created by LWS on 2019-09-04 14:53
 * Version 1.0
 */
public class ConvertFactory {

    public static BaseResponse convert(Response<BaseResponse> response, Gson gson){
        if (response.isSuccessful()){
            Object body = response.body();
            Log.e("----",response.body().toString());
            if (body == null || response.code() == 204){
                return new BaseResponse<>("没有数据",-1);
            } else {
                BaseResponse baseResponse = response.body();
                if (baseResponse.getData() == null){
                    return new BaseResponse<>("没有数据",-1);
                }
                return baseResponse;
            }

        } else {
            try {
                String msg = response.errorBody().string();
                return new BaseResponse<>(msg,response.code());
            } catch (IOException e) {
                e.printStackTrace();
                return new BaseResponse<>("未知异常",-2);
            }
        }
    }
    public static BaseResponse convertErroe(Throwable throwable){
        if (throwable !=null) {
            return new BaseResponse(throwable.getMessage(),-1);
        } else {
            return new BaseResponse("未知异常",-1);
        }

    }
}
