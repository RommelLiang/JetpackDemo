/*
 * Copyright (c) KYE 2019, All Rights Reserved
 */

package com.ramesses.jetpackdemo.rxjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.ramesses.jetpackdemo.R;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class BackPressureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backpressure);
        Observer<Integer> observer = new Observer<Integer>() {

            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Integer integer) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Log.e("无背压监听到了onNext", String.valueOf(integer));
            }

            @Override
            public void onError(Throwable e) {

                Log.w("无背压监听到了onError", e);
            }

            @Override
            public void onComplete() {

            }
        };
        Subscriber<Integer> subscriber = new Subscriber<Integer>() {

            @Override
            public void onSubscribe(Subscription s) {

            }

            @Override
            public void onNext(Integer integer) {
/*
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                Log.e("有背压监听到了onNext", String.valueOf(integer));
            }

            @Override
            public void onError(Throwable t) {

                Log.w("有背压监听到了onError", t);
            }

            @Override
            public void onComplete() {

            }
        };
        Flowable
                .create(new FlowableOnSubscribe<Integer>() {

                    @Override
                    public void subscribe(FlowableEmitter<Integer> emitter) throws Exception {

                        for (int i = 0; ; i++) {
                            emitter.onNext(i);
                        }
                    }
                }, BackpressureStrategy.LATEST)
                .observeOn(Schedulers.newThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(subscriber);
      /*  Observable
                .create(new ObservableOnSubscribe<Integer>() {

                    @Override
                    public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {

                        for (int i = 0; ; i++) {
                            emitter.onNext(i);
                        }
                    }
                })
                .observeOn(Schedulers.newThread())
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);*/
    }
}
