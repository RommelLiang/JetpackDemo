/*
 * Copyright (c) KYE 2019, All Rights Reserved
 */

package com.ramesses.jetpackdemo.LiveData;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.ramesses.jetpackdemo.bean.User;
import com.ramesses.net.ApiService;
import com.ramesses.net.BaseResponse;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/**
 * Routing
 * Desc    TODO
 * Source
 * Created by LWS on 2019-08-31 18:03
 * Version 1.0
 */
public class UserViewModel extends ViewModel {

    private MutableLiveData<User>    mUserMutableLiveData;
    private LiveData<BaseResponse<User>> login;

    public UserViewModel() {


    }

    public LiveData<BaseResponse<User>> getUser() {
         login = ApiService.getInstance().login(
                "00d91e8e0cca2b76f515926a36db68f5",
                "13594347817",
                "123456");
        return login;
    }


}
