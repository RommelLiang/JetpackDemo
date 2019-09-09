/*
 * Copyright (c) KYE 2019, All Rights Reserved
 */

package com.ramesses.jetpackdemo.LiveData;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

/**
 * Routing
 * Desc    TODO
 * Source
 * Created by LWS on 2019-09-09 12:05
 * Version 1.0
 */
public class LifecycleModel extends ViewModel {

    private MutableLiveData<String> mUserMutableLiveData = new MutableLiveData<>();

    public MutableLiveData<String> getMsg(){
        return mUserMutableLiveData;
    }

    public void updata(String msg){
        mUserMutableLiveData.setValue(msg);
    }
}
