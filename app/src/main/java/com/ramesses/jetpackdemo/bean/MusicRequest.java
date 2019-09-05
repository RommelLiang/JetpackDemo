/*
 * Copyright (c) KYE 2019, All Rights Reserved
 */

package com.ramesses.jetpackdemo.bean;

import com.ramesses.jetpackdemo.BuildConfig;

/**
 * Routing
 * Desc    TODO
 * Source
 * Created by LWS on 2019-09-05 16:57
 * Version 1.0
 */
public class MusicRequest {
    private String kye = BuildConfig.MUSIC_API;
    private String keyword;

    public MusicRequest(String keyword) {

        this.keyword = keyword;
    }

    public String getKye() {

        return kye;
    }

    public void setKye(String kye) {

        this.kye = kye;
    }

    public String getKeyword() {

        return keyword;
    }

    public void setKeyword(String keyword) {

        this.keyword = keyword;
    }
}
