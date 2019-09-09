/*
 * Copyright (c) KYE 2019, All Rights Reserved
 */

package com.ramesses;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ramesses.jetpackdemo.LiveData.LifecycleActivity;
import com.ramesses.jetpackdemo.LiveData.LiveDataActivity;
import com.ramesses.jetpackdemo.R;
import com.ramesses.webView.WebViewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.liveData).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LiveDataActivity.class));
            }
        });
        findViewById(R.id.webView).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WebViewActivity.class));
            }
        });
        findViewById(R.id.lifecycle).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LifecycleActivity.class));
            }
        });
    }
}
