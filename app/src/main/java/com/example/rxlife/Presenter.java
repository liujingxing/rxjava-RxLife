package com.example.rxlife;

import android.util.Log;

import androidx.lifecycle.LifecycleOwner;

import com.rxjava.rxlife.BaseScope;
import com.rxjava.rxlife.RxLife;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;


/**
 * User: ljx
 * Date: 2019-05-26
 * Time: 15:20
 */
public class Presenter extends BaseScope {

    public Presenter(LifecycleOwner owner) {
        super(owner); //添加生命周期监听
        Observable.interval(1, 1, TimeUnit.SECONDS)
            .to(RxLife.to(this)) //这里的this 为Scope接口对象
            .subscribe(aLong -> {
                Log.e("LJX", "accept aLong=" + aLong);
            });
    }


    private void test() {
        Observable.interval(1, 1, TimeUnit.SECONDS)
            .to(RxLife.to(this)) //这里的this 为Scope接口对象
            .subscribe(aLong -> {
                Log.e("LJX", "accept aLong=" + aLong);
            });
    }
}
