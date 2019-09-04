/*
 * Copyright (c) KYE 2019, All Rights Reserved
 */

package com.ramesses.net;

import com.google.gson.Gson;

import java.io.IOException;

import retrofit2.Response;

/**
 * Routing
 * Desc    TODO
 * Source
 * Created by LWS on 2019-09-03 19:37
 * Version 1.0
 */
public class BaseResponse<T> {
    private String msg;
    private int code;
    private T data;

    public BaseResponse(String msg, int code, T data) {

        this.msg = msg;
        this.code = code;
        this.data = data;
    }
    public BaseResponse(String msg, int code) {

        this.msg = msg;
        this.code = code;
    }
    public String getMsg() {

        return msg;
    }

    private void setMsg(String msg) {

        this.msg = msg;
    }

    public int getCode() {

        return code;
    }

    private void setCode(int code) {

        this.code = code;
    }

    public T getData() {

        return data;
    }

    private void setData(T data) {

        this.data = data;
    }
}
