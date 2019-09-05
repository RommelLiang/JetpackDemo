/*
 * Copyright (c) KYE 2019, All Rights Reserved
 */

package com.ramesses.jetpackdemo.LiveData;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.ramesses.jetpackdemo.R;
import com.ramesses.jetpackdemo.bean.User;
import com.ramesses.jetpackdemo.databinding.ActivityLiveDataBinding;
import com.ramesses.net.BaseResponse;

public class LiveDataActivity extends AppCompatActivity {

    private UserViewModel           mUserViewModle;
    private ActivityLiveDataBinding mBinding;
    private User                    mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_live_data);

        mUserViewModle = ViewModelProviders.of(this).get(UserViewModel.class);
        mUserViewModle.getUser().observe(this, new Observer<BaseResponse<User>>() {

            @Override
            public void onChanged(
                    @Nullable BaseResponse<User> userBaseResponse) {

                if (userBaseResponse.getCode() == 200) {
                    refreshUser(userBaseResponse.getData());
                }
                Log.e(userBaseResponse.toString(), "");
            }
        });

    }

    private void refreshUser(User user) {

        mUser = user;
        mBinding.setUser(mUser);
    }
}
