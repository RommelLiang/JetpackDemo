/*
 * Copyright (c) KYE 2019, All Rights Reserved
 */

package com.ramesses.jetpackdemo.LiveData;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ramesses.jetpackdemo.R;

public class LifecycleActivity extends AppCompatActivity {

    private LifecycleModel mLifecycleModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        mLifecycleModel =  ViewModelProviders.of(this).get(LifecycleModel.class);
        mLifecycleModel.getMsg().observe(this, new Observer<String>() {

            @Override
            public void onChanged(@Nullable String s) {

                Log.e("onChanged:",s);
            }
        });
        Log.e("生命周期:","onCreate");
        mLifecycleModel.updata("onCreate");
    }

    @Override
    protected void onStart() {

        super.onStart();
        Log.e("生命周期:","onStart");
        mLifecycleModel.updata("onStart");
    }

    @Override
    protected void onRestart() {

        super.onRestart();
        Log.e("生命周期:","onRestart");
        mLifecycleModel.updata("onRestart");
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.e("生命周期:","onResume");
        mLifecycleModel.updata("onResume");
    }

    @Override
    protected void onPause() {

        super.onPause();
        Log.e("生命周期:","onPause");
        mLifecycleModel.updata("onPause");
    }

    @Override
    protected void onStop() {

        super.onStop();
        Log.e("生命周期:","onStop");
        mLifecycleModel.updata("onStop");
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
        Log.e("生命周期:","onDestroy");
        mLifecycleModel.updata("onDestroy");
    }

}
