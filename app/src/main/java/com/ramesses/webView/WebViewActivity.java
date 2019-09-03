/*
 * Copyright (c) KYE 2019, All Rights Reserved
 */

package com.ramesses.webView;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ramesses.jetpackdemo.R;

public class WebViewActivity extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        mWebView = findViewById(R.id.webView);
        WebSettings mWebSettings = mWebView.getSettings();
        mWebView.loadUrl("https://baike.baidu.com/item/NBA/95277?fr=aladdin");
    }
}
