/*
 * Copyright (c) KYE 2019, All Rights Reserved
 */

package com.ramesses.jetpackdemo.LiveData;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.ramesses.jetpackdemo.bean.User;

/**
 * Routing
 * Desc    TODO
 * Source
 * Created by LWS on 2019-08-31 18:03
 * Version 1.0
 */
public class UserViewModel extends ViewModel {

    private MutableLiveData<User> mUserMutableLiveData;
    private User mUser;
    public UserViewModel(){
        mUserMutableLiveData = new MutableLiveData<>();
        mUser = new User();
    }

    public MutableLiveData<User> getUser() {
        mUser.setName("小狗");
        mUser.setAge(4);
        mUserMutableLiveData.setValue(mUser);
        return mUserMutableLiveData;
    }

    public void updateUser(String name,int age) {
        mUser.setName(name);
        mUser.setAge(age);
        mUserMutableLiveData.setValue(mUser);
    }

}
