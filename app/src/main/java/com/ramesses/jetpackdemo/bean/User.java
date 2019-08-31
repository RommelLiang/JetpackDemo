/*
 * Copyright (c) KYE 2019, All Rights Reserved
 */

package com.ramesses.jetpackdemo.bean;

/**
 * Routing
 * Desc    TODO
 * Source
 * Created by LWS on 2019-08-31 18:04
 * Version 1.0
 */
public class User {
    private String name;
    private int age;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getAge() {

        return String.valueOf(age);
    }

    public void setAge(int age) {

        this.age = age;
    }
}
