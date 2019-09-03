/*
 * Copyright (c) KYE 2019, All Rights Reserved
 */

package com.ramesses.jetpackdemo.LiveData;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.ramesses.jetpackdemo.bean.User;

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
    private MutableLiveData<Boolean> mBooleanMutableLiveData;
    private User                     mUser;

    public UserViewModel() {

        mUserMutableLiveData = new MutableLiveData<>();

        mBooleanMutableLiveData = new MutableLiveData<>();
        mUser = new User();
    }

    public MutableLiveData<User> getUser() {

        mUser.setName("小狗");
        mUser.setAge(4);
        mUserMutableLiveData.setValue(mUser);
        return mUserMutableLiveData;
    }

    public MutableLiveData<Boolean> getLoading() {

        return mBooleanMutableLiveData;
    }

    public void updateUser(final String name, final int age) {

        mBooleanMutableLiveData.setValue(true);
        Observable.just(new User())
                  .doOnNext(new Consumer<User>() {

                      @Override
                      public void accept(User user) throws Exception {

                          user.setName(name);
                          user.setAge(age);
                      }
                  })
                  .flatMap(new Function<User, ObservableSource<?>>() {

                      @Override
                      public ObservableSource<?> apply(User user) throws Exception {

                          return Observable.just(user);
                      }
                  })
                  .subscribe(new Consumer<Object>() {

                      @Override
                      public void accept(Object o) throws Exception {

                          mUser.setName(name);
                          mUser.setAge(age);
                          mUserMutableLiveData.setValue(mUser);
                          mBooleanMutableLiveData.setValue(false);
                      }
                  });
    }

}
