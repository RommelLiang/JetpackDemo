/*
 * Copyright (c) KYE 2019, All Rights Reserved
 */

package com.ramesses.jetpackdemo.LiveData;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.ramesses.jetpackdemo.R;
import com.ramesses.jetpackdemo.bean.User;

public class LiveDataActivity extends AppCompatActivity {

    private UserViewModel mUserViewModle;
    private TextView      mName;
    private TextView      mAge;
    private Observer<User> mUserObserver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_data);
        mName = findViewById(R.id.tv_name);
        mAge = findViewById(R.id.tv_age);
        mUserObserver = new Observer<User>() {
            @Override
            public void onChanged(@Nullable User user) {
                mName.setText(user.getName());
                mAge.setText(user.getAge());
            }
        };
        mUserViewModle = ViewModelProviders.of(this).get(UserViewModel.class);
        mUserViewModle.getUser().observe(this,mUserObserver);
        mUserViewModle.updateUser("小猫",8);

    }
}
